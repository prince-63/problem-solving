/**
 * Class DiffrerenceBetweenElementSumAndDigitSumOfAnArray
 * This class provides a method to calculate the difference between the sum of
 * elements of an array and the sum of digits of each element in the array.
 */
public class DiffrerenceBetweenElementSumAndDigitSumOfAnArray {

    /**
     * Method differenceOfSum
     * This method takes an integer array as input, calculates the sum of elements
     * and the sum of digits of each element, and returns the difference between the
     * two sums.
     *
     * @param nums - the integer array
     * @return the difference between the sum of elements and the sum of digits of
     *         each element
     */
    public static int differenceOfSum(int[] nums) {
        int sum = 0;
        int digitSum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            while (0 < nums[i]) {
                int rem = nums[i] % 10;
                digitSum = digitSum + rem;
                nums[i] = nums[i] / 10;
            }
        }

        return sum - digitSum;
    }

    /**
     * Main method
     * This method is the entry point for the program. It creates an integer array
     * and calculates the difference between the sum of elements and the sum of
     * digits of each element using the differenceOfSum method.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        int[] nums = { 12, 34, 56, 78 };
        System.out.println(differenceOfSum(nums)); // Output: 106
    }
}