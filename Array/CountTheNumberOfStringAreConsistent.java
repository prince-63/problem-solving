/**
 * Class CountTheNumberOfStringAreConsistent
 * This class provides methods to count the number of consistent strings.
 * A string is consistent if all its characters are in the allowed string.
 */
public class CountTheNumberOfStringAreConsistent {

    /**
     * Method countConsistentStrings
     * This method takes a string of allowed characters and an array of words, and
     * returns the number of consistent words.
     * Time complexity: O(n*m*k), where n is the number of words, m is the average
     * length of a word, and k is the length of the allowed string.
     * Space complexity: O(1), as the space used does not depend on the size of the
     * input.
     *
     * @param allowed - the string of allowed characters
     * @param words   - the array of words
     * @return the number of consistent words
     */
    public static int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for (String word : words) {
            boolean isConsistent = true;
            for (int i = 0; i < word.length(); i++) {
                if (!allowed.contains(String.valueOf(word.charAt(i)))) {
                    isConsistent = false;
                    break;
                }
            }
            if (isConsistent) {
                count++;
            }
        }
        return count;
    }

    /**
     * Method countConsistentStrings1
     * This method takes a string of allowed characters and an array of words, and
     * returns the number of consistent words.
     * This method is optimized to have a lower time complexity than the previous
     * method.
     * Time complexity: O(n*m), where n is the number of words and m is the average
     * length of a word.
     * Space complexity: O(1), as the space used does not depend on the size of the
     * input.
     *
     * @param allowed - the string of allowed characters
     * @param words   - the array of words
     * @return the number of consistent words
     */
    public static int countConsistentStrings1(String allowed, String[] words) {
        boolean[] isAllowed = new boolean[26];
        for (char c : allowed.toCharArray()) {
            isAllowed[c - 'a'] = true;
        }

        int count = 0;
        for (String word : words) {
            boolean isConsistent = true;
            for (char c : word.toCharArray()) {
                if (!isAllowed[c - 'a']) {
                    isConsistent = false;
                    break;
                }
            }
            if (isConsistent) {
                count++;
            }
        }
        return count;
    }

    /**
     * Main method
     * This method is the entry point for the program. It creates a string of
     * allowed characters and an array of words, and uses the countConsistentStrings
     * method to count the number of consistent words.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = { "ad", "bd", "aaab", "baa", "badab" };
        System.out.println(countConsistentStrings(allowed, words)); // Output: 2
    }
}