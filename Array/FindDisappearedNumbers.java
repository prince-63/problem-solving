import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

/**
 * Class FindDisappearedNumbers
 * This class provides a method to find all the elements that appear in [1, n]
 * but not in the given array.
 */
public class FindDisappearedNumbers {

    /**
     * Method findDisappearedNumbers
     * This method takes an integer array as input, and returns a list of all the
     * elements that appear in [1, n] but not in the array.
     * The method uses a count array to keep track of the occurrence of each number
     * in the array, and then finds the numbers that do not appear in the array by
     * checking the count array.
     *
     * @param nums - the integer array
     * @return a list of all the elements that appear in [1, n] but not in the array
     */
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        int[] count = new int[nums.length + 1];
        Arrays.fill(count, 0);

        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }

        for (int i = 1; i < count.length; i++) {
            if (count[i] == 0) {
                list.add(i);
            }
        }
        return list;
    }

    /**
     * Main method
     * This method is the entry point for the program. It creates an integer array
     * and finds all the elements that appear in [1, n] but not in the array using
     * the findDisappearedNumbers method.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };

        List<Integer> list = findDisappearedNumbers(nums);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
