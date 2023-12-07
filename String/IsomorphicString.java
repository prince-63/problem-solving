/**
 * Class IsomorphicString
 * This class provides a method to check if two strings are isomorphic.
 * Two strings are isomorphic if the characters in the first string can be
 * replaced to get the second string.
 */
public class IsomorphicString {

    /**
     * Method isIsomorphic
     * This method takes two strings and checks if they are isomorphic.
     *
     * @param s - the first string
     * @param t - the second string
     * @return true if the strings are isomorphic, false otherwise
     */
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;
        int[] map = new int[256];
        int[] reverseMap = new int[256];
        for (int i = 0; i < s.length(); i++) {
            if (map[s.charAt(i)] == 0 && reverseMap[t.charAt(i)] == 0) {
                map[s.charAt(i)] = t.charAt(i);
                reverseMap[t.charAt(i)] = s.charAt(i);
            } else if (map[s.charAt(i)] != t.charAt(i) || reverseMap[t.charAt(i)] != s.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Main method
     * This method is the entry point for the program. It creates an
     * IsomorphicString object and uses it to check if several pairs of strings are
     * isomorphic.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        IsomorphicString sol = new IsomorphicString();
        System.out.println(sol.isIsomorphic("egg", "add")); // Output: true
        System.out.println(sol.isIsomorphic("foo", "bar")); // Output: false
        System.out.println(sol.isIsomorphic("paper", "title")); // Output: true
        System.out.println(sol.isIsomorphic("ab", "aa")); // Output: false
    }
}