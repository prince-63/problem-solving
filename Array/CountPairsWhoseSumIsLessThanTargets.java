import java.util.List;
import java.util.Collections;

/**
 * Class CountPairsWhoseSumIsLessThanTargets
 * This class provides a method to count the number of pairs in a list whose sum
 * is less than a given target.
 */
public class CountPairsWhoseSumIsLessThanTargets {

    /**
     * Method countPairs
     * This method takes a list of integers and a target as input, and counts the
     * number of pairs in the list whose sum is less than the target.
     * The method first sorts the list, then uses two pointers to traverse the list
     * from both ends, incrementing the count whenever the sum of the two pointed
     * numbers is less than the target.
     *
     * @param nums   - the list of integers
     * @param target - the target sum
     * @return the number of pairs whose sum is less than the target
     */
    public static int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int count = 0;
        int start = 0;
        int end = nums.size() - 1;

        while (start < end) {
            if (nums.get(start) + nums.get(end) < target) {
                count += end - start;
                start++;
            } else {
                end--;
            }
        }

        return count;
    }

    /**
     * Main method
     * This method is the entry point for the program. It creates a list of integers
     * and a target, and counts the number of pairs in the list whose sum is less
     * than the target using the countPairs method.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4, 5);
        int target = 7;

        System.out.println(countPairs(nums, target)); // Output: 7
    }
}