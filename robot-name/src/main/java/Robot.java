import java.util.HashSet;
import java.util.Random;
import java.util.Set;

class Robot {

    static final int A_LIMIT = 65;
    static final int Z_LIMIT = 90;
    static final int STR_LIMIT = 2;
    static final int NUM_LIMIT = 1000;

    private static Set<String> namesGenerated = new HashSet<>();

    private String name = "";

    public Robot() {
        // Generate name
        this.name = generateName();
    }

    private String generateName() {
        String name = "";

        // create instance of Random class
        Random rand = new Random();

        do {
            String generatedString = rand.ints(A_LIMIT, Z_LIMIT+1)
                .limit(STR_LIMIT)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

            // Generate random integers in range 0 to 999
            int number = rand.nextInt(NUM_LIMIT);
            
            name = generatedString + number;

        } while (namesGenerated.contains(name));

        namesGenerated.add(name);
        return name;
    }
    
    String getName() {
        // if (this.name.isEmpty()) generateName();
        return this.name;
    }

    void reset() {
        this.name = generateName();
    }

}