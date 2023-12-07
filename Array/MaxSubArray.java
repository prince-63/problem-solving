/**
 * Class MaxSubArray
 * This class provides a method to calculate the maximum subarray sum in an
 * array.
 */
class MaxSubArray {

    /**
     * Method maxSubArray
     * This method takes an array of integers and returns the maximum subarray sum
     * in the array.
     * The subarray sum is calculated using Kadane's algorithm.
     * Time complexity: O(n), where n is the length of the array, as there is a
     * single loop iterating over the array.
     * Space complexity: O(1), as the space used does not depend on the size of the
     * input.
     *
     * @param A - the array of integers
     * @return the maximum subarray sum in the array
     */
    public static int maxSubArray(final int[] A) {
        int maxSum = A[0];
        int currSum = A[0];

        for (int i = 1; i < A.length; i++) {
            currSum = Math.max(A[i], currSum + A[i]);
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }

    /**
     * Main method
     * This method is the entry point for the program. It creates an array and uses
     * the maxSubArray method to calculate the maximum subarray sum in the array.
     * Time complexity: O(n), where n is the length of the array, as it calls the
     * maxSubArray method.
     * Space complexity: O(1), as the space used does not depend on the size of the
     * input.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        int arr[] = { -120, -202, -293, -60, -261, -67, 10, 82, -334, -393, -428, -182, -138, -167, -465, -347, -39,
                -51, -61, -491, -216, -36, -281, -361, -271, -368, -122, -114, -53, -488, -327, -182, -221, -381, -431,
                -161, -59, -494, -406, -298, -268, -425, -88, -320, -371, -5, 36, 89, -194, -140, -278, -65, -38, -144,
        };
        System.out.println(maxSubArray(arr));
    }
}