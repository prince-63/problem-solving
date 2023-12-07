/**
 * Class MatrixDIagonalSum
 * This class provides a method to calculate the sum of the matrix diagonals.
 */
public class MatrixDIagonalSum {

    /**
     * Method diagonalSum
     * This method takes a 2D array (matrix) and returns the sum of the matrix diagonals.
     * If the matrix is odd-sized, the central element is counted twice, so it is subtracted once to get the correct sum.
     *
     * @param mat - the 2D array (matrix)
     * @return the sum of the matrix diagonals
     */
    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        for(int i = 0; i < n; i++) {
            sum += mat[i][i];
            sum += mat[i][n-i-1];
        }
        if(n % 2 != 0) {
            sum -= mat[n/2][n/2];
        }
        return sum;
    }

    /**
     * Main method
     * This method is the entry point for the program. It creates a 2D array (matrix) and uses the diagonalSum method to calculate the sum of the matrix diagonals.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(diagonalSum(mat)); // Output: 25
    }
}