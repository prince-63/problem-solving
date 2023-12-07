import java.util.Arrays;
import java.util.Comparator;

/**
 * Class LargestNumber
 * This class provides a method to form the largest possible number from an array of integers.
 */
public class LargestNumber {

    /**
     * Method largestNumber
     * This method takes an array of integers as input, and returns a string representing the largest possible number that can be formed by concatenating the integers.
     * The method converts the integers to strings, sorts the strings in a special order where s1 + s2 is compared with s2 + s1, and then concatenates the sorted strings.
     * If the largest number is 0 (which can happen if the input array only contains zeros), the method returns "0".
     *
     * @param nums - the array of integers
     * @return a string representing the largest possible number that can be formed by concatenating the integers
     */
    public static String largestNumber(int[] nums) {
        String[] str = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            str[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(str, new Comparator<String>() {
            public int compare(String s1, String s2) {
                String s1s2 = s1 + s2;
                String s2s1 = s2 + s1;
                return s2s1.compareTo(s1s2);
            }
        });

        if (str[0].equals("0")) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        for (String s : str) {
            sb.append(s);
        }

        return sb.toString();
    }

    /**
     * Main method
     * This method is the entry point for the program. It creates an array of integers, and prints the largest possible number that can be formed by concatenating the integers.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        int[] nums = { 3, 30, 34, 5, 9 };
        System.out.println(largestNumber(nums));
    }
}