import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class Scrabble {

    private static final Map<Character, Integer> LETTER_VALUES = 
    Collections.unmodifiableMap(new HashMap<Character, Integer>() {
        { 
            put('A', 1);
            put('E', 1);
            put('I', 1);
            put('O', 1);
            put('U', 1);
            put('L', 1);
            put('N', 1);
            put('R', 1);
            put('S', 1);
            put('T', 1);
            put('D', 2);
            put('G', 2);
            put('B', 3);
            put('C', 3);
            put('M', 3);
            put('P', 3);
            put('F', 4);
            put('H', 4);
            put('V', 4);
            put('W', 4);
            put('Y', 4);
            put('K', 5);
            put('J', 8);
            put('X', 8);
            put('Q', 10);
            put('Z', 10);
        }
    });

    private String word;

    Scrabble(String word) {
        this.word = word;
    }

    int getScore() {
        int score = 0;

        for(char c : this.word.toCharArray()) {
            try {
                score += LETTER_VALUES.get(Character.toUpperCase(c));
            } catch (Exception e) {
                System.out.println("This character \"" + c + "\" is not valid.");
            }
        }

        return score;
    }

}
