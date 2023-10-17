public class Hamming {

    private final String leftStrand;
    private final String rightStrand;

    public Hamming(String leftStrand, String rightStrand) {
        if (leftStrand.isEmpty() && !rightStrand.isEmpty()) {
            throw new IllegalArgumentException("left strand must not be empty.");
        } else if (!leftStrand.isEmpty() && rightStrand.isEmpty()) {
            throw new IllegalArgumentException("right strand must not be empty.");
        } else if (leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }

        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
    }

    public int getHammingDistance() {
        int i = 0;
        int distance = 0;

        for (char c : this.leftStrand.toCharArray()) {
            if (c != this.rightStrand.charAt(i++))
                distance++;
        }

        return distance;
    }

}
