import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

class Matrix {

    private String[] rows;

    Matrix(String matrixAsString) {
        rows = matrixAsString.split("\n");
    }

    int[] getRow(int rowNumber) {
        List<Integer> row = new ArrayList<>();

        for (String numStr : rows[rowNumber - 1].split(" ")) {
            row.add(Integer.parseInt(numStr));
        }

        return row.stream().mapToInt(Integer::intValue).toArray();
    }

    int[] getColumn(int columnNumber) {
        List<Integer> column = new ArrayList<>();

        for (String str : rows) {
            column.add(Integer.parseInt(str.split(" ")[columnNumber - 1]));
        }

        return column.stream().mapToInt(Integer::intValue).toArray();
    }

}
