/**
 * Class TruncateSentence
 * This class provides a method to truncate a sentence to the first k words.
 */
public class TruncateSentence {

    /**
     * Method truncateSentence
     * This method takes a string and an integer as input, and returns a string that contains the first k words of the input string.
     * The method iterates through the string and counts the number of spaces. When the number of spaces is equal to k, the method breaks the loop and returns the substring from the start of the string to the current index.
     *
     * @param s - the input string
     * @param k - the number of words to keep in the sentence
     * @return a string that contains the first k words of the input string
     */
    public static String truncateSentence(String s, int k) {
        int i = 0;
        for (; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                k--;
                if (k == 0) {
                    break;
                }
            }
        }
        return s.substring(0, i);
    }

    /**
     * Main method
     * This method is the entry point for the program. It creates a string and an integer, and truncates the string to the first k words using the truncateSentence method.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int k = 4;
        System.out.println(truncateSentence(s, k));  // Output: "Hello how are you"
    }
}