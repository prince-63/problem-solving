/**
 * Class LeftAndRightSumDifferences
 * This class provides a method to calculate the absolute difference between the
 * sum of the numbers on the left and the sum of the numbers on the right for
 * each number in an array.
 */
public class LeftAndRightSumDifferences {

    /**
     * Method leftRightDifference
     * This method takes an array of integers as input, and returns an array where
     * each element is the absolute difference between the sum of the numbers on the
     * left and the sum of the numbers on the right for the corresponding number in
     * the input array.
     * The method calculates the total sum of the numbers, and then iterates through
     * the array, subtracting each number from the total sum and adding it to the
     * sum of the numbers on the left, and storing the absolute difference in the
     * result array.
     *
     * @param nums - the array of integers
     * @return an array where each element is the absolute difference between the
     *         sum of the numbers on the left and the sum of the numbers on the
     *         right for the corresponding number in the input array
     */
    public static int[] leftRightDifference(int[] nums) {
        int[] answer = new int[nums.length];
        int leftSum = 0;
        int rightSum = 0;

        for (int num : nums) {
            rightSum += num;
        }

        for (int i = 0; i < nums.length; i++) {
            rightSum -= nums[i];
            answer[i] = Math.abs(leftSum - rightSum);
            leftSum += nums[i];
        }

        return answer;
    }

    /**
     * Main method
     * This method is the entry point for the program. It creates an array of
     * integers, and prints the absolute differences between the sum of the numbers
     * on the left and the sum of the numbers on the right for each number in the
     * array.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        int[] answer = leftRightDifference(nums);
        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ");
        }
    }
}