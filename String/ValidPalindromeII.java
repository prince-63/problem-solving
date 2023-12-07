/**
 * Class ValidPalindromeII
 * This class provides methods to check if a string can become a palindrome by
 * removing at most one character.
 */
public class ValidPalindromeII {

    /**
     * Method validPalindrome
     * This method takes a string and checks if it can become a palindrome by
     * removing at most one character.
     *
     * @param s - the string to check
     * @return true if the string can become a palindrome by removing at most one
     *         character, false otherwise
     */
    public boolean validPalindrome(String s) {
        if (s == null || s.length() == 0)
            return true;
        int left = 0, right = s.length() - 1;

        while (left < right) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);
            if (leftChar != rightChar) {
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }
            ++left;
            --right;
        }
        return true;
    }

    /**
     * Method isPalindrome
     * This method takes a string and checks if it is a palindrome.
     *
     * @param s     - the string to check
     * @param left  - the index of the first character to consider
     * @param right - the index of the last character to consider
     * @return true if the string is a palindrome, false otherwise
     */
    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);
            if (leftChar != rightChar)
                return false;
            ++left;
            --right;
        }
        return true;
    }

    /**
     * Main method
     * This method is the entry point for the program. It creates a
     * ValidPalindromeII object and uses it to check if several strings can become
     * palindromes by removing at most one character.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        ValidPalindromeII vp = new ValidPalindromeII();
        System.out.println(vp.validPalindrome("aba"));
        System.out.println(vp.validPalindrome("abca"));
        System.out.println(vp.validPalindrome("abc"));
    }
}