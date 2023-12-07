/**
 * Class AntiDiagonalMatrix
 * This class provides methods to convert a given square matrix into an
 * anti-diagonal matrix and print the anti-diagonal matrix.
 */
public class AntiDiagonalMatrix {

    /**
     * Method diagonal
     * This method takes a square matrix and returns an anti-diagonal matrix.
     * It iterates over the elements of the input matrix and rearranges them into an
     * anti-diagonal matrix.
     * Time complexity: O(n^2), where n is the length of the input matrix, as there
     * are nested loops iterating over the matrix.
     * Space complexity: O(n), as a new matrix of size 2n-1 is created.
     *
     * @param A - the input square matrix
     * @return the anti-diagonal matrix
     */
    public static int[][] diagonal(int[][] A) {
        int n = A.length;
        int[][] B = new int[2 * n - 1][];
        for (int i = 0; i < 2 * n - 1; i++) {
            int r = i < n ? 0 : i - n + 1;
            int c = i < n ? i : n - 1;
            int len = i < n ? i + 1 : 2 * n - i - 1;
            B[i] = new int[len];
            for (int j = 0; j < len; j++) {
                B[i][j] = A[r++][c--];
            }
        }
        return B;
    }

    /**
     * Method printDiagonalMatrix
     * This method takes a square matrix and prints its anti-diagonal matrix.
     * It iterates over the elements of the input matrix and prints them in an
     * anti-diagonal order.
     * Time complexity: O(n^2), where n is the length of the input matrix, as there
     * are nested loops iterating over the matrix.
     * Space complexity: O(1), as no additional space is used.
     *
     * @param A - the input square matrix
     */
    public static void printDiagonalMatrix(int[][] A) {
        int N = A.length;

        // For each column start row is 0
        for (int col = 0; col < N; col++) {
            int startcol = col, startrow = 0;
            while (startcol >= 0 && startrow < N) {
                System.out.print(A[startrow][startcol] + " ");
                startcol--;
                startrow++;
            }
            System.out.println();
        }

        // For each row start column is N-1
        for (int row = 1; row < N; row++) {
            int startrow = row, startcol = N - 1;
            while (startrow < N && startcol >= 0) {
                System.out.print(A[startrow][startcol] + " ");
                startcol--;
                startrow++;
            }
            System.out.println();
        }
    }

    /**
     * Main method
     * This method is the entry point for the program. It creates a sample square
     * matrix, converts it into an anti-diagonal matrix, and prints the
     * anti-diagonal matrix.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        int[][] A = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] B = diagonal(A);
        for (int[] row : B) {
            for (int x : row) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
        printDiagonalMatrix(A);
    }
}
