import java.util.*;

/**
 * Class GroupAnagrams
 * This class provides a method to group anagrams together.
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 */
public class GroupAnagrams {

    /**
     * Method groupAnagrams
     * This method takes an array of strings as input, and returns a list of lists, where each list contains all the anagram strings from the input array.
     * The method uses a HashMap to group the anagram strings together. The key of the HashMap is the sorted string, and the value is the list of strings that are anagrams of the key.
     *
     * @param strs - the array of strings
     * @return a list of lists, where each list contains all the anagram strings from the input array
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);
            if (!map.containsKey(key)) map.put(key, new ArrayList<>());
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }

    /**
     * Main method
     * This method is the entry point for the program. It creates an array of strings and groups the anagram strings together using the groupAnagrams method.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams.groupAnagrams(strs));
    }
}