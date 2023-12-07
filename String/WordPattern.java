import java.util.HashMap;

/**
 * Class WordPattern
 * This class provides a method to check if a string follows a given pattern.
 */
public class WordPattern {

    /**
     * Method wordPattern
     * This method takes a pattern and a string, and checks if the string follows
     * the pattern.
     * Each character in the pattern corresponds to a word in the string, and no two
     * characters correspond to the same word.
     *
     * @param pattern - the pattern to check
     * @param s       - the string to check
     * @return true if the string follows the pattern, false otherwise
     */
    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length())
            return false;
        HashMap<Character, String> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            char c = pattern.charAt(i);
            if (map.containsKey(c)) {
                if (!map.get(c).equals(words[i]))
                    return false;
            } else {
                if (map.containsValue(words[i]))
                    return false;
                map.put(c, words[i]);
            }
        }
        return true;
    }

    /**
     * Main method
     * This method is the entry point for the program. It creates a pattern and a
     * string, and uses the wordPattern method to check if the string follows the
     * pattern.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        System.out.println(wordPattern(pattern, s));
    }
}