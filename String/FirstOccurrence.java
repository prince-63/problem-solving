/**
 * Class FirstOccurrence
 * This class provides a method to find the first occurrence of a substring in a
 * given string.
 */
public class FirstOccurrence {

    /**
     * Method strStr
     * This method takes a string (haystack) and a substring (needle), and returns
     * the index of the first occurrence of the needle in the haystack.
     * If the needle is not part of the haystack, it returns -1.
     *
     * @param haystack - the string in which to search for the needle
     * @param needle   - the substring to search for
     * @return the index of the first occurrence of the needle in the haystack, or
     *         -1 if the needle is not part of the haystack
     */
    public static int strStr(String haystack, String needle) {
        if (needle.length() == 0)
            return 0;
        int index = 0;
        while (index < haystack.length()) {
            if (haystack.charAt(index) == needle.charAt(0)) {
                int i = 0;
                while (i < needle.length() && index + i < haystack.length()
                        && haystack.charAt(index + i) == needle.charAt(i)) {
                    i++;
                }
                if (i == needle.length())
                    return index;
            }
            index++;
        }
        return -1;
    }

    /**
     * Main method
     * This method is the entry point for the program. It creates a string and a
     * substring, and uses the strStr method to find the first occurrence of the
     * substring in the string.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        System.out.println(strStr(haystack, needle)); // Output: 0
    }
}