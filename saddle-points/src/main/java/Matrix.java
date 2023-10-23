import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Matrix {

    private List<List<Integer>> matrix;

    Matrix(List<List<Integer>> values) {
        matrix = values;
    }

    Set<MatrixCoordinate> getSaddlePoints() {

        Set<MatrixCoordinate> saddlePoints = new HashSet<MatrixCoordinate>();

        for (int i = 0; i < matrix.size(); i++) {
            List<Integer> maxRowPositions = findMaxRowPositions(i);
            for (Integer rowPos : maxRowPositions) {
                findSaddlePoints(i, rowPos.intValue(), saddlePoints);
            }
        }

        return saddlePoints;
    }

    private List<Integer> findMaxRowPositions(int row) {

        List<Integer> maxRowPositions = new ArrayList<>();
        
        List<Integer> rowList = matrix.get(row);
        int max = rowList.get(0);
        maxRowPositions.add(0);

        for (int i = 1; i < rowList.size(); i++) {
            int currentValue = rowList.get(i);

            if (currentValue > max) {
                max = currentValue;
                maxRowPositions.clear();   // Empty the list with current value
                maxRowPositions.add(i);    // Save the new value with the maximum
            } else if (currentValue == max) {
                maxRowPositions.add(i);    // Save the value equals the maximum
            }
        }

        return maxRowPositions;
    }

    private void findSaddlePoints(int row, int col, Set<MatrixCoordinate> saddlePoints) {
        Set<MatrixCoordinate> points = new HashSet<MatrixCoordinate>();
        Boolean insertBool =  false;

        int min = matrix.get(row).get(col);

        for (int i = 0; i < matrix.size(); i++) {
            int currentValue = matrix.get(i).get(col);

            if (i != row) {
                if (currentValue < min) {
                    insertBool = false;
                    break;
                } 
            } else {
                insertBool = true;
                MatrixCoordinate point = new MatrixCoordinate(i+1, col+1);
                points.add(point);
            }
        }

        if (insertBool) {
            for (MatrixCoordinate matrixCoordinate : points) {
                saddlePoints.add(matrixCoordinate);
            }
        }
    }   
}
