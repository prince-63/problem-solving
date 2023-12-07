import java.util.*;

public class UniqueLengthThreeValidPalindromeSequance {
    public int countPalindromicSubsequence(String s) {
        // optimal solution
        // time: O(n)
        // space: O(1)
        // int res = 0;
        // for (char c = 'a'; c <= 'z'; c++) {
        // int i = s.indexOf(c);
        // int j = s.lastIndexOf(c);
        // if (i != -1 && j != -1 && i != j) {
        // res += s.substring(i + 1, j).chars().distinct().count();
        // }
        // }
        // return res;

        int count = 0;
        for (char c = 'a'; c <= 'z'; c++) {
            int first = s.indexOf(c);
            int last = s.lastIndexOf(c);
            System.out.println("first: " + first + " last: " + last);
            if (first != -1 && last != -1 && first != last) {
                Set<Character> set = new HashSet<>();
                for (int i = first + 1; i < last; i++) {
                    set.add(s.charAt(i));
                }
                count += set.size();
            }
        }
        return count;
    }

    public static void main(String[] args) {
        UniqueLengthThreeValidPalindromeSequance obj = new UniqueLengthThreeValidPalindromeSequance();
        System.out.println(obj.countPalindromicSubsequence("aabca"));
    }
}
