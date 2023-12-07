/**
 * Class ValidPalindrome
 * This class provides a method to check if a string is a palindrome,
 * considering only alphanumeric characters and ignoring cases.
 */
public class ValidPalindrome {

    /**
     * Method isPalindrome
     * This method takes a string and checks if it is a palindrome, considering only
     * alphanumeric characters and ignoring cases.
     *
     * @param s - the string to check
     * @return true if the string is a palindrome, false otherwise
     */
    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0)
            return true;
        int left = 0, right = s.length() - 1;

        while (left < right) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);
            if (!Character.isLetterOrDigit(leftChar)) {
                ++left;
                continue;
            }
            if (!Character.isLetterOrDigit(rightChar)) {
                --right;
                continue;
            }
            if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar))
                return false;
            ++left;
            --right;
        }
        return true;
    }

    /**
     * Main method
     * This method is the entry point for the program. It creates a ValidPalindrome
     * object and uses it to check if a string is a palindrome.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        ValidPalindrome validPalindrome = new ValidPalindrome();
        System.out.println(validPalindrome.isPalindrome("A man, a plan, a canal: Panama")); // Output: true
    }
}