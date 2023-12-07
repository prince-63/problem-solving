import java.util.Arrays;

/**
 * Class NobleInteger
 * This class provides a method to check if there exists a noble integer in an
 * array.
 * A noble integer is an integer 'x' in the array such that the number of
 * integers greater than 'x' is equal to 'x'.
 */
public class NobleInteger {

    /**
     * Method nobleInteger
     * This method takes an array of integers and checks if there exists a noble
     * integer in the array.
     * It sorts the array and then iterates over the elements to find a noble
     * integer.
     * Time complexity: O(n log n), where n is the length of the array, due to the
     * sorting operation.
     * Space complexity: O(1), as no additional space is used.
     *
     * @param A - the array of integers
     * @return 1 if there exists a noble integer in the array, -1 otherwise
     */
    public static int nobleInteger(int[] A) {
        int n = A.length;
        int count = 0;
        Arrays.sort(A);
        for (int i = 0; i < n - 1; i++) {
            if (A[i] != A[i + 1]) {
                count = n - i - 1;
            }

            if (A[i] == count && i == n - 1) {
                return 1;
            }
        }
        return -1;
    }

    /**
     * Main method
     * This method is the entry point for the program. It creates a sample array of
     * integers, calls the nobleInteger method with this array, and prints the
     * result.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        int[] A = { 1, 2, 7, 0, 9, 3, 6, 0, 6 };
        System.out.println(nobleInteger(A));
    }
}