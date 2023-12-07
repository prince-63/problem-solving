import java.util.ArrayList;

/**
 * Class MaxSumOfNonNegativeSubarray
 * This class provides a method to find the maximum sum sub-array of
 * non-negative numbers from an array.
 */
public class MaxSumOfNonNegativeSubarray {

    /**
     * Method maxset
     * This method takes an array of integers and returns the maximum sum sub-array
     * of non-negative numbers.
     * The sub-array should be contiguous. If there is a tie, it returns the
     * sub-array with the maximum length. If there is still a tie, it returns the
     * sub-array with the minimum starting index.
     * Time complexity: O(n), where n is the length of the array, as there is a
     * single loop iterating over the array.
     * Space complexity: O(n), as two ArrayLists of size n are created.
     *
     * @param A - the array of integers
     * @return an array of integers representing the maximum sum sub-array of
     *         non-negative numbers
     */
    public static int[] maxset(int[] A) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        long maxSum = 0;
        long tempSum = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] >= 0) {
                temp.add(A[i]);
                tempSum += A[i];
            } else {
                if (tempSum > maxSum) {
                    maxSum = tempSum;
                    result = new ArrayList<Integer>(temp);
                } else if (tempSum == maxSum) {
                    if (temp.size() > result.size()) {
                        result = new ArrayList<Integer>(temp);
                    }
                }
                temp = new ArrayList<Integer>();
                tempSum = 0;
            }
        }
        // Check for the last subarray
        if (tempSum > maxSum || (tempSum == maxSum && temp.size() > result.size())) {
            result = temp;
        }
        // Convert ArrayList to array
        int[] res = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            res[i] = result.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] A = { 1, 2, 5, -7, 2, 3 };
        int[] result = maxset(A);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " "); // 1 2 5
        }
    }
}
