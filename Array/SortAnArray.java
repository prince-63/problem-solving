import java.util.Arrays;

/**
 * Class SortAnArray
 * This class provides a method to sort an array in ascending order.
 */
public class SortAnArray {

    /**
     * Method sortArray
     * This method takes an integer array as input, and returns the array sorted in ascending order.
     * The method uses the Arrays.sort method from the Java standard library to sort the array.
     *
     * @param arr - the integer array
     * @return the sorted array
     */
    public static int[] sortArray(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    /**
     * Main method
     * This method is the entry point for the program. It creates an integer array and sorts the array using the sortArray method.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        int[] nums = { 5, 2, 3, 1 };
        int[] result = sortArray(nums);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}