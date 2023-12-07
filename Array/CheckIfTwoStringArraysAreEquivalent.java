/**
 * Class CheckIfTwoStringArraysAreEquivalent
 * This class provides a method to check if two string arrays are equivalent.
 */
public class CheckIfTwoStringArraysAreEquivalent {

    /**
     * Method arrayStringsAreEqual
     * This method takes two string arrays as input, concatenates the strings in each array, and checks if the resulting strings are equal.
     *
     * @param word1 - the first string array
     * @param word2 - the second string array
     * @return true if the concatenated strings are equal, false otherwise
     */
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (String s : word1) {
            sb1.append(s);
        }
        for (String s : word2) {
            sb2.append(s);
        }
        return sb1.toString().equals(sb2.toString());
    }

    /**
     * Main method
     * This method is the entry point for the program. It creates two string arrays and checks if they are equivalent using the arrayStringsAreEqual method.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1, word2));  // Output: true
    }
}