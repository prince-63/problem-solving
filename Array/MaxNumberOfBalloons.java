/**
 * Class MaxNumberOfBalloons
 * This class provides a method to calculate the maximum number of instances of the word "balloon" that can be formed using the characters in a given string.
 */
public class MaxNumberOfBalloons {

    /**
     * Method maxNumberOfBalloons
     * This method takes a string as input, and returns the maximum number of instances of the word "balloon" that can be formed using the characters in the string.
     * The method creates an array to count the occurrences of each letter in the string, and then calculates the minimum number of times that each letter in the word "balloon" occurs, taking into account that the letters 'l' and 'o' occur twice in the word.
     *
     * @param text - the string to check
     * @return the maximum number of instances of the word "balloon" that can be formed
     */
    public static int maxNumberOfBalloons(String text) {
        int[] letters = new int[26];
        for (char c : text.toCharArray()) {
            letters[c - 'a']++;
        }
        int min = letters['b' - 'a'];
        min = Math.min(min, letters['a' - 'a']);
        min = Math.min(min, letters['l' - 'a'] / 2);
        min = Math.min(min, letters['o' - 'a'] / 2);
        min = Math.min(min, letters['n' - 'a']);
        return min;
    }

    /**
     * Main method
     * This method is the entry point for the program. It creates a string, and prints the maximum number of instances of the word "balloon" that can be formed using the characters in the string.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        String text = "nlaebolko";
        System.out.println(maxNumberOfBalloons(text));
    }
}