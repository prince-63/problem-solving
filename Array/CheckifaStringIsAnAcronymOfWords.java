import java.util.ArrayList;
import java.util.List;

/**
 * Class CheckifaStringIsAnAcronymOfWords
 * This class provides a method to check if a string is an acronym of a list of
 * words.
 */
public class CheckifaStringIsAnAcronymOfWords {

    /**
     * Method isAcronym
     * This method takes a list of words and a string as input, and checks if the
     * string is an acronym of the words.
     * Each character in the string should match the first character of the
     * corresponding word in the list.
     *
     * @param words - a list of words
     * @param s     - a string
     * @return true if the string is an acronym of the words, false otherwise
     */
    public static boolean isAcronym(List<String> words, String s) {
        if (words.size() != s.length()) {
            return false;
        }

        int k = 0;
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).charAt(0) != s.charAt(k)) {
                return false;
            }
            k++;
        }

        return true;
    }

    /**
     * Main method
     * This method is the entry point for the program. It creates a list of words
     * and a string, and checks if the string is an acronym of the words using the
     * isAcronym method.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        List<String> words = new ArrayList<String>();
        words.add("apple");
        words.add("banana");
        words.add("cat");

        String s = "abc";

        System.out.println(isAcronym(words, s));
    }
}