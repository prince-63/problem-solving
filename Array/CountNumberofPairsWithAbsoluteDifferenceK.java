/**
 * Class CountNumberofPairsWithAbsoluteDifferenceK
 * This class provides a method to count the number of pairs in an array with an absolute difference of K.
 */
public class CountNumberofPairsWithAbsoluteDifferenceK {

    /**
     * Method countKDifference
     * This method takes an array of integers and a target difference as input, and returns the count of pairs in the array that have an absolute difference of K.
     *
     * @param nums - an array of integers
     * @param k - the target difference
     * @return count - the number of pairs in the array with an absolute difference of K
     */
    public static int countKDifference(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int diff = Math.abs(nums[i] - nums[j]);
                if (diff == k) {
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * Main method
     * This method is the entry point for the program. It creates an array of integers and a target difference, and prints the count of pairs in the array with an absolute difference of K.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 1 };
        int k = 1;

        System.out.println(countKDifference(nums, k));
    }
}