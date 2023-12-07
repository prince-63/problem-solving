import java.util.Arrays;

/**
 * Class MultipleLeftRotationsOfTheArray
 * This class provides a method to perform multiple left rotations on an array.
 */
public class MultipleLeftRotationsOfTheArray {

    /**
     * Method solve
     * This method takes two arrays of integers. The first array is the one to be
     * rotated, and the second array contains the number of positions to rotate for
     * each operation.
     * It performs a left rotation on the first array for each element in the second
     * array and stores the result.
     * Time complexity: O(n*m), where n is the length of the first array and m is
     * the length of the second array.
     * Space complexity: O(n*m), as a 2D array of size n*m is created.
     *
     * @param A - the array to be rotated
     * @param B - the array containing the number of positions to rotate
     * @return a 2D array containing the result of each rotation
     */
    public static int[][] solve(int[] A, int[] B) {
        int lenB = B.length;
        int lenA = A.length;
        int index = 0;

        int ans[][] = new int[lenB][lenA];

        for (int i = 0; i < lenB; i++) {
            index = 0;
            int rotation = B[i] % lenA; // Use modulo to prevent index out of bounds
            for (int j = rotation; j < lenA; j++) {
                ans[i][index++] = A[j];
            }

            for (int j = 0; j < rotation; j++) {
                ans[i][index++] = A[j];
            }
        }

        return ans;
    }

    /**
     * Main method
     * This method is the entry point for the program. It creates two sample arrays,
     * calls the solve method with these arrays, and prints the result.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        int A[] = { 6, 31, 33, 13, 82, 66, 9, 12, 69, 21, 17, 2, 50, 69, 90, 71, 31, 1, 13, 70, 94, 46, 89, 13, 55, 54,
                67, 97, 28, 27, 62, 34, 41, 18, 15, 35, 13, 84, 93, 27, 89, 23, 6, 56, 94, 40, 54, 95, 47 };
        int B[] = { 88, 85, 98, 36, 66, 40, 30, 26, 51, 77, 62, 60, 92, 64, 53, 86, 24, 53, 85, 49, 57, 29, 32, 60, 75,
                82, 17, 23, 67, 51, 23, 11, 70, 59 };
        int ans[][] = solve(A, B);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(Arrays.toString(ans[i]));
        }
    }
}