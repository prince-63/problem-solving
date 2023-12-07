import java.util.*;

public class FirstNegativeNumberInEveryWindowOfSizeK {
    // sliding window technique
    // time complexity: O(n)
    // space complexity: O(k)
    public static void printFirstNegativeNumberInEveryWindowOfSizeK(int[] arr, int k) {
        List<Integer> list = new ArrayList<>(); // to store negative numbers in a window
        int windowStart = 0; // to keep track of window start

        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            // if negative number, add to list
            if (arr[windowEnd] < 0) {
                list.add(arr[windowEnd]);
            }
            // if window size is reached, print first negative number in list
            if (windowEnd - windowStart + 1 >= k) {
                // if list is empty, print 0
                if (list.size() == 0) {
                    System.out.print(0 + " ");
                } else {
                    System.out.print(list.get(0) + " ");
                    // if first negative number is the window start, remove it from list
                    if (arr[windowStart] == list.get(0)) {
                        list.remove(0);
                    }
                }
                windowStart++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 12, -1, -7, 8, -15, 30, 16, 28 };
        int k = 3;
        printFirstNegativeNumberInEveryWindowOfSizeK(arr, k);
    }
}
