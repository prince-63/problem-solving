/**
 * Class CountGoodTriplets
 * This class provides a method to count the number of good triplets in an array.
 */
public class CountGoodTriplets {

    /**
     * Method countGoodTriplets
     * This method takes an array of integers and three integers a, b, and c, and returns the number of good triplets in the array.
     * A triplet (arr[i], arr[j], arr[k]) is called good if the conditions abs(arr[i] - arr[j]) <= a, abs(arr[j] - arr[k]) <= b, and abs(arr[i] - arr[k]) <= c are satisfied.
     * Time complexity: O(n^3), where n is the length of the array, as there are three nested loops iterating over the array.
     * Space complexity: O(1), as the space used does not depend on the size of the input.
     *
     * @param arr - the array of integers
     * @param a - the first condition integer
     * @param b - the second condition integer
     * @param c - the third condition integer
     * @return the number of good triplets in the array
     */
    public static int countGoodTriplets(int[] arr, int a, int b, int c) {
        int countTriplets = 0;
        int size = arr.length;

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                for (int k = j + 1; k < size; k++) {
                    if (Math.abs(arr[i] - arr[j]) <= a && Math.abs(arr[j] - arr[k]) <= b
                            && Math.abs(arr[i] - arr[k]) <= c) {
                        countTriplets += 1;
                    }
                }
            }
        }

        return countTriplets;
    }

    /**
     * Main method
     * This method is the entry point for the program. It creates an array and three integers a, b, and c, and uses the countGoodTriplets method to count the number of good triplets in the array.
     * Time complexity: O(n^3), where n is the length of the array, as it calls the countGoodTriplets method.
     * Space complexity: O(1), as the space used does not depend on the size of the input.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        int[] arr = { 3, 0, 1, 1, 9, 7 };
        int a = 7;
        int b = 2;
        int c = 3;
        System.out.println(countGoodTriplets(arr, a, b, c));
    }
}