import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class WordCount {

    public Map<String, Integer> phrase(String input) {
        // Creating an empty HashMap
        Map<String, Integer> hashMap = new HashMap<String, Integer>();

        // Creating Regular Expression
        String regex = "([0-9a-z]+('t)*)";
        
        // Pattern-Matcher
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);
        
        // Iterate Matcher saving words into the Map increasing counter
        while(matcher.find()) {
            String word = matcher.group(1);
            System.out.println(word);

            if (hashMap.containsKey(word.toLowerCase())) {
                hashMap.put(word.toLowerCase(), hashMap.get(word.toLowerCase()) + 1);
            } else {
                hashMap.put(word.toLowerCase(), 1);
            }
        } 

        return hashMap;
    }

}
