import java.util.ArrayList;
import java.util.Arrays;

class Triangle {

    private double side1;
    private double side2;
    private double side3;

    Triangle(double side1, double side2, double side3) throws TriangleException {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

        if (checkNotPossibleTriangle())
            throw new TriangleException();
    }

    private boolean checkNotPossibleTriangle() {
        double[] sides = new double[]{ this.side1, this.side2, this.side3 };
        Arrays.sort(sides);

        return (sides[0] + sides[1] <= sides[2]) ? true:false;
    }

    boolean isEquilateral() {
        return Arrays.asList(this.side1, this.side2, this.side3)
        .stream()
        .distinct()
        .count() == 1;
    }

    boolean isIsosceles() {
        return Arrays.asList(this.side1, this.side2, this.side3)
        .stream()
        .distinct()
        .count() <= 2;
    }

    boolean isScalene() {
        return Arrays.asList(this.side1, this.side2, this.side3)
        .stream()
        .distinct()
        .count() == 3;
    }

}
