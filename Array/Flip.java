/**
 * Class Flip
 * This class provides a method to find the maximum sequence of continuous '1's
 * that can be achieved by flipping at most one '0' in a binary string.
 */
public class Flip {

    /**
     * Method flip
     * This method takes a binary string and returns the start and end indices of
     * the maximum sequence of continuous '1's that can be achieved by flipping at
     * most one '0'.
     * It uses the Kadane's algorithm to find the maximum subarray sum, where '0's
     * are considered as 1 and '1's are considered as -1.
     * Time complexity: O(n), where n is the length of the string, as there is a
     * single loop iterating over the string.
     * Space complexity: O(n), as an array of size n is created.
     *
     * @param A - the binary string
     * @return an array of two integers representing the start and end indices of
     *         the maximum sequence of continuous '1's
     */
    public static int[] flip(String A) {
        int[] arr = new int[A.length()];
        for (int i = 0; i < A.length(); i++) {
            arr[i] = A.charAt(i) == '0' ? 1 : -1;
        }
        int maxSum = Integer.MIN_VALUE;
        int maxStart = 0;
        int maxEnd = 0;
        int currSum = 0;
        int currStart = 0;

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            if (currSum > maxSum) {
                maxSum = currSum;
                maxStart = currStart;
                maxEnd = i;
            }
            if (currSum < 0) {
                currSum = 0;
                currStart = i + 1;
            }
        }
        if (maxSum <= 0) {
            return new int[0];
        }
        return new int[] { maxStart + 1, maxEnd + 1 };
    }

    /**
     * Main method
     * This method is the entry point for the program. It creates a sample binary
     * string, calls the flip method with this string, and prints the result.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        String A = "010";
        int[] result = flip(A);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
    }
}