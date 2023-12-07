/**
 * Class GenerateSpiralMatrix
 * This class provides a method to generate a square matrix filled with elements
 * from 1 to n^2 in spiral order.
 */
public class GenerateSpiralMatrix {

    /**
     * Method generateMatrix
     * This method takes an integer n and returns a square matrix of size n x n
     * filled with elements from 1 to n^2 in spiral order.
     * The spiral order starts from the top left corner and proceeds in a clockwise
     * direction.
     * Time complexity: O(n^2), where n is the input to the method, as each position
     * in the matrix is filled once.
     * Space complexity: O(n^2), as a new matrix of size n x n is created.
     *
     * @param n - the size of the square matrix
     * @return a square matrix of size n x n filled with elements from 1 to n^2 in
     *         spiral order
     */
    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int rowStart = 0, rowEnd = n - 1, colStart = 0, colEnd = n - 1;
        int num = 1;
        while (rowStart <= rowEnd && colStart <= colEnd) {
            // Traverse right
            for (int j = colStart; j <= colEnd; j++) {
                matrix[rowStart][j] = num++;
            }
            rowStart++;
            // Traverse down
            for (int i = rowStart; i <= rowEnd; i++) {
                matrix[i][colEnd] = num++;
            }
            colEnd--;
            // Traverse left
            if (rowStart <= rowEnd) {
                for (int j = colEnd; j >= colStart; j--) {
                    matrix[rowEnd][j] = num++;
                }
            }
            rowEnd--;
            // Traverse up
            if (colStart <= colEnd) {
                for (int i = rowEnd; i >= rowStart; i--) {
                    matrix[i][colStart] = num++;
                }
            }
            colStart++;
        }
        return matrix;
    }

    /**
     * Main method
     * This method is the entry point for the program. It uses the generateMatrix
     * method to generate a square matrix of a given size in spiral order and prints
     * the matrix.
     * Time complexity: O(n^2), where n is the size of the matrix, as it calls the
     * generateMatrix method.
     * Space complexity: O(n^2), as the space used depends on the size of the input.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        int[][] matrix = generateMatrix(3);
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}