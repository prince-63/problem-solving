import java.util.*;

public class CountOccurrencesOfAnagrams {
    public static int countAnagrams(String s, String p) {
        int count = 0;
        int k = p.length();
        int i = 0, j = 0;
        int n = s.length();

        // HashMap to store the frequency of characters in the pattern
        HashMap<Character, Integer> map = new HashMap<>();

        // Store the frequency of characters in the pattern
        for (char c : p.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Count the number of distinct characters in the pattern
        int distinct = map.size();

        // Sliding window
        // Traverse the string
        while (j < n) {

            // Get the character at the current index
            // and decrement its frequency in the map
            char ch = s.charAt(j);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) - 1);
                if (map.get(ch) == 0) {
                    distinct--;
                }
            }

            // If the window size is less than k, expand the window
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {

                // If the window size is equal to k
                if (distinct == 0) {
                    count++;
                }

                // Remove the character at the start of the window
                if (map.containsKey(s.charAt(i))) {

                    // Increment the frequency of the character
                    map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
                    // If the frequency becomes 1, increment the distinct count
                    if (map.get(s.charAt(i)) == 1) {
                        distinct++;
                    }
                }
                i++;
                j++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "aabaabaa";
        String p = "aaba";
        System.out.println(countAnagrams(s, p));
    }
}
