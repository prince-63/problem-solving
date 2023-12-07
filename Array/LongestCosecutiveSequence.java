import java.util.Arrays;

/**
 * Class LongestConsecutiveSequence
 * This class provides a method to find the length of the longest consecutive
 * elements sequence in an array.
 */
class LongestConsecutiveSequence {

    /**
     * Method longestConsecutive
     * This method takes an array of integers as input, and returns the length of
     * the longest consecutive elements sequence.
     * The method sorts the array, and then iterates through it, keeping track of
     * the length of the current sequence and the length of the longest sequence
     * found so far.
     *
     * @param nums - the array of integers
     * @return the length of the longest consecutive elements sequence
     */
    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;
        Arrays.sort(nums);
        int max = 1;
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                count++;
            } else if (nums[i] == nums[i - 1]) {
                continue;
            } else {
                max = Math.max(max, count);
                count = 1;
            }
        }
        return Math.max(max, count);
    }

    /**
     * Main method
     * This method is the entry point for the program. It creates an array of
     * integers, and prints the length of the longest consecutive elements sequence
     * in the array.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        int arr[] = { 100, 4, 200, 1, 3, 2 };
        System.out.println(longestConsecutive(arr));
    }
}