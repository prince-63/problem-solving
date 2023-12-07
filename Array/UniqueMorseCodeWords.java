import java.util.HashSet;
import java.util.Set;

/**
 * Class UniqueMorseCodeWords
 * This class provides a method to count the number of unique Morse code
 * representations for a set of words.
 */
public class UniqueMorseCodeWords {

    /**
     * Method uniqueMorseRepresentations
     * This method takes an array of words and returns the number of unique Morse
     * code representations.
     *
     * @param words - the array of words
     * @return the number of unique Morse code representations
     */
    public int uniqueMorseRepresentations(String[] words) {
        String[] morseCode = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---",
                "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-",
                "..-", "...-", ".--", "-..-", "-.--", "--.." };
        Set<String> set = new HashSet<>();
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (char c : word.toCharArray()) {
                sb.append(morseCode[c - 'a']);
            }
            set.add(sb.toString());
        }
        return set.size();
    }

    /**
     * Main method
     * This method is the entry point for the program. It creates an array of words
     * and uses the uniqueMorseRepresentations method to count the number of unique
     * Morse code representations.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        String[] words = { "gin", "zen", "gig", "msg" };
        UniqueMorseCodeWords umcw = new UniqueMorseCodeWords();
        System.out.println(umcw.uniqueMorseRepresentations(words)); // Output: 2
    }
}