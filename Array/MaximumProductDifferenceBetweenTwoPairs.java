/**
 * Class MaximumProductDifferenceBetweenTwoPairs
 * This class provides a method to calculate the maximum product difference
 * between two pairs in an array.
 */
public class MaximumProductDifferenceBetweenTwoPairs {

    /**
     * Method maxProductDifference
     * This method takes an array of integers and returns the maximum product
     * difference between two pairs in the array.
     * The product difference is calculated as the product of the maximum and second
     * maximum elements minus the product of the minimum and second minimum
     * elements.
     * Time complexity: O(n), where n is the length of the array, as there are two
     * loops iterating over the array.
     * Space complexity: O(1), as the space used does not depend on the size of the
     * input.
     *
     * @param nums - the array of integers
     * @return the maximum product difference between two pairs in the array
     */
    public static int maxProductDifference(int[] nums) {
        int maxProductDifference = 0;
        int size = nums.length;

        // Find the maximum and second maximum elements in the array
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            if (nums[i] > max1) {
                max2 = max1;
                max1 = nums[i];
            } else if (nums[i] > max2) {
                max2 = nums[i];
            }
        }

        // Find the minimum and second minimum elements in the array
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            if (nums[i] < min1) {
                min2 = min1;
                min1 = nums[i];
            } else if (nums[i] < min2) {
                min2 = nums[i];
            }
        }

        // Calculate the maximum product difference
        maxProductDifference = max1 * max2 - min1 * min2;

        return maxProductDifference;
    }

    /**
     * Main method
     * This method is the entry point for the program. It creates an array and uses
     * the maxProductDifference method to calculate the maximum product difference
     * between two pairs in the array.
     * Time complexity: O(n), where n is the length of the array, as it calls the
     * maxProductDifference method.
     * Space complexity: O(1), as the space used does not depend on the size of the
     * input.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        int[] nums = { 5, 6, 2, 7, 4 };
        System.out.println(maxProductDifference(nums));
    }
}