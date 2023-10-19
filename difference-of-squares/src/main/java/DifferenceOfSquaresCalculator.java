import java.util.stream.IntStream;

class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        return (int)Math.pow((double)IntStream
        .range(0, input + 1)
        .sum(), 2);
    }

    int computeSumOfSquaresTo(int input) {
        return (int)IntStream.range(0, input + 1)
        .reduce(0, (counter, num) -> counter + (num * num));
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

}
