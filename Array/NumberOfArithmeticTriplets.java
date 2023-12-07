import java.util.HashMap;
import java.util.Map;

/**
 * Class NumberOfArithmeticTriplets
 * This class provides a method to count the number of arithmetic triplets in an array.
 */
public class NumberOfArithmeticTriplets {

    /**
     * Method arithmeticTriplets
     * This method takes an array of numbers and a difference as input, and returns the number of arithmetic triplets in the array.
     * An arithmetic triplet is a sequence of three numbers where the difference between consecutive numbers is equal to the given difference.
     * The method uses a frequency map to count the number of occurrences of each number, and then iterates through the array, checking for each number if there are numbers in the array that are equal to the current number minus the difference and the current number plus the difference.
     *
     * @param nums - the array of numbers
     * @param diff - the difference
     * @return the number of arithmetic triplets in the array
     */
    public static int arithmeticTriplets(int[] nums, int diff) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int count = 0;
        for (int num : nums) {
            if (freq.containsKey(num - diff) && freq.containsKey(num + diff)) {
                count += freq.get(num - diff) * freq.get(num + diff);
            }
        }

        return count;
    }

    /**
     * Main method
     * This method is the entry point for the program. It creates an array of numbers and a difference, and prints the number of arithmetic triplets in the array.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int diff = 1;
        System.out.println(arithmeticTriplets(nums, diff));
    }
}