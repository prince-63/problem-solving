import java.util.Arrays;

/**
 * Class FindTheHighestAltitude
 * This class provides methods to find the highest altitude.
 */
public class FindTheHighestAltitude {

    /**
     * Method largestAltitude
     * This method takes an array of altitude gains and returns the highest
     * altitude.
     * Time complexity: O(n), where n is the length of the gain array.
     * Space complexity: O(n), as an array of the same size as the input is created.
     *
     * @param gain - the array of altitude gains
     * @return the highest altitude
     */
    public static int largestAltitude(int[] gain) {
        int[] altitudes = new int[gain.length + 1];
        altitudes[0] = 0;
        for (int i = 0; i < gain.length; i++) {
            altitudes[i + 1] = altitudes[i] + gain[i];
        }
        return Arrays.stream(altitudes).max().getAsInt();
    }

    /**
     * Method largestAltitude1
     * This method takes an array of altitude gains and returns the highest
     * altitude.
     * This method is similar to the previous one, but it uses sorting to find the
     * maximum altitude.
     * Time complexity: O(n log n), where n is the length of the gain array, due to
     * the sorting operation.
     * Space complexity: O(n), as an array of the same size as the input is created.
     *
     * @param gain - the array of altitude gains
     * @return the highest altitude
     */
    public static int largestAltitude1(int[] gain) {
        int n = gain.length;
        int[] arr = new int[n + 1];

        arr[0] = 1;

        for (int i = 0; i < n; i++) {
            arr[i + 1] = arr[i] + gain[i];
        }

        Arrays.sort(arr);

        return arr[arr.length - 1] - 1;
    }

    /**
     * Main method
     * This method is the entry point for the program. It creates an array of
     * altitude gains and uses the largestAltitude method to find the highest
     * altitude.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        int[] gain = { -5, 1, 5, 0, -7 };
        System.out.println(largestAltitude(gain)); // Output: 1
    }
}