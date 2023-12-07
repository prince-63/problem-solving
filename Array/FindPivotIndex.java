/**
 * Class FindPivotIndex
 * This class provides a method to find the pivot index of an array.
 * The pivot index is the index where the sum of all the numbers to the left of
 * the index is equal to the sum of all the numbers to the right of the index.
 */
public class FindPivotIndex {

    /**
     * Method pivotIndex
     * This method takes an integer array as input, and returns the pivot index of
     * the array.
     * If no such index exists, the method returns -1.
     * The method first calculates the total sum of the array, then iterates through
     * the array and checks if the left sum is equal to the total sum minus the left
     * sum minus the current number.
     *
     * @param nums - the integer array
     * @return the pivot index of the array, or -1 if no such index exists
     */
    public int pivotIndex(int[] nums) {
        // Time Complexity: O(n)
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == sum - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }

    /**
     * Main method
     * This method is the entry point for the program. It creates an integer array
     * and finds the pivot index of the array using the pivotIndex method.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        FindPivotIndex fpi = new FindPivotIndex();
        int[] nums = { 1, 7, 3, 6, 5, 6 };
        System.out.println(fpi.pivotIndex(nums));
    }
}