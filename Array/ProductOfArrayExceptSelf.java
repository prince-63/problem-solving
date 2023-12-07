/**
 * Class ProductOfArrayExceptSelf
 * This class provides a method to calculate the product of the array except for the current number.
 */
public class ProductOfArrayExceptSelf {

    /**
     * Method productExceptSelf
     * This method takes an integer array as input, and returns an array where each element is the product of all the numbers in the original array except the one at the current index.
     * The method calculates the product of all the numbers to the left and to the right of each number, and multiplies these products to get the final result.
     *
     * @param nums - the integer array
     * @return an array where each element is the product of all the numbers in the original array except the one at the current index
     */
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = nums[i - 1] * result[i - 1];
        }

        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= right;
            right *= nums[i];
        }

        return result;
    }

    /**
     * Main method
     * This method is the entry point for the program. It creates an integer array, calculates the product of the array except for each number using the productExceptSelf method, and prints the results.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4 };
        int result[] = productExceptSelf(nums);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }
}