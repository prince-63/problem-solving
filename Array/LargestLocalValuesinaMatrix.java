/**
 * Class LargestLocalValuesinaMatrix
 * This class provides a method to find the largest local values in a matrix.
 */
public class LargestLocalValuesinaMatrix {

    /**
     * Method findLargestLocal
     * This method takes an n x n integer matrix as input, and generates an (n - 2)
     * x (n - 2) integer matrix such that each element in the generated matrix is
     * equal to the largest value of the 3 x 3 matrix in the input matrix centered
     * around the corresponding row and column.
     *
     * @param grid - an n x n integer matrix
     * @return maxLocal - an (n - 2) x (n - 2) integer matrix where each element is
     *         the largest value of the corresponding 3 x 3 matrix in the input
     *         matrix
     */
    public static int[][] findLargestLocal(int[][] grid) {
        int n = grid.length;
        int[][] maxLocal = new int[n - 2][n - 2];

        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                int maxVal = Integer.MIN_VALUE;
                for (int x = i - 1; x <= i + 1; x++) {
                    for (int y = j - 1; y <= j + 1; y++) {
                        maxVal = Math.max(maxVal, grid[x][y]);
                    }
                }
                maxLocal[i - 1][j - 1] = maxVal;
            }
        }

        return maxLocal;
    }

    /**
     * Main method
     * This method is the entry point for the program. It creates an n x n integer
     * matrix and prints the generated (n - 2) x (n - 2) integer matrix returned by
     * the findLargestLocal method.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        int[][] grid = { { 9, 9, 8, 1 }, { 5, 6, 2, 6 }, { 8, 2, 6, 4 }, { 6, 2, 2, 2 } };
        int[][] maxLocal = findLargestLocal(grid);

        for (int[] row : maxLocal) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}