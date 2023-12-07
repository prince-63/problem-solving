/**
 * Class LongestCommonPrefix
 * This class provides a method to find the longest common prefix string amongst
 * an array of strings.
 */
public class LongestCommonPrefix {

    /**
     * Method longestCommonPrefix_String
     * This method takes an array of strings and returns the longest common prefix
     * string.
     *
     * @param s - the array of strings
     * @return the longest common prefix string
     */
    public static String longestCommonPrefix_String(String[] s) {
        if (s.length == 0)
            return "";
        String prefix = s[0];
        for (int i = 1; i < s.length; i++) {
            while (s[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty())
                    return "";
            }
        }
        return prefix;
    }

    /**
     * Main method
     * This method is the entry point for the program. It creates an array of
     * strings and uses the longestCommonPrefix_String method to find the longest
     * common prefix string.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        String[] strings = { "flower", "flow", "flight" };
        System.out.println(longestCommonPrefix_String(strings)); // Output: "fl"
    }
}