import java.util.Arrays;

/**
 * Class WaveArray
 * This class provides a method to rearrange an array into a sequence where a1
 * >= a2 <= a3 >= a4 <= a5 and so on.
 */
public class WaveArray {

    /**
     * Method wave
     * This method takes an array of integers and rearranges it into a sequence
     * where a1 >= a2 <= a3 >= a4 <= a5 and so on.
     * It first sorts the array, then iterates over the array, swapping every pair
     * of elements.
     * Time complexity: O(n log n), where n is the length of the array, due to the
     * sorting operation.
     * Space complexity: O(1), as no additional space is used.
     *
     * @param A - the array of integers
     * @return the array rearranged into a wave sequence
     */
    public static int[] wave(int[] A) {
        int n = A.length;
        Arrays.sort(A);
        for (int i = 0; i < n - 1; i += 2) {
            int temp = A[i];
            A[i] = A[i + 1];
            A[i + 1] = temp;
        }
        return A;
    }

    /**
     * Main method
     * This method is the entry point for the program. It calls the wave method with
     * a sample array and prints the result.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        int[] result = wave(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}