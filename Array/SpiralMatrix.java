/**
 * Class SpiralMatrix
 * This class provides a method to return the elements of a 2D matrix in spiral order.
 */
public class SpiralMatrix {

    /**
     * Method spiralOrder
     * This method takes a 2D array of integers and returns the elements in spiral order.
     * The spiral order starts from the top left corner and proceeds in a clockwise direction.
     * Time complexity: O(m*n), where m is the number of rows and n is the number of columns in the matrix, as each element is visited once.
     * Space complexity: O(m*n), as a new array of size m*n is created to store the result.
     *
     * @param A - the 2D array of integers
     * @return an array of integers representing the elements of the 2D array in spiral order
     */
    public static int[] spiralOrder(final int[][] A) {
        int[] result = new int[A.length * A[0].length];
        int top = 0;
        int bottom = A.length - 1;
        int left = 0;
        int right = A[0].length - 1;
        int index = 0;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                result[index++] = A[top][i];
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                result[index++] = A[i][right];
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result[index++] = A[bottom][i];
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result[index++] = A[i][left];
                }
                left++;
            }
        }

        return result;
    }

    /**
     * Main method
     * This method is the entry point for the program. It creates a 2D array and uses the spiralOrder method to print the elements in spiral order.
     * Time complexity: O(m*n), where m is the number of rows and n is the number of columns in the matrix, as it calls the spiralOrder method.
     * Space complexity: O(m*n), as the space used depends on the size of the input.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 }, { 12, 13, 14, 5 }, { 11, 16, 15, 6 }, { 10, 9, 8, 7 } };
        int[] result = spiralOrder(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + ", ");
        }
    }
}