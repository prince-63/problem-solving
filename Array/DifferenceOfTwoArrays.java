import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Class DifferenceOfTwoArrays
 * This class provides a method to find the difference between two integer
 * arrays.
 */
public class DifferenceOfTwoArrays {

    /**
     * Method findDifference
     * This method takes two integer arrays as input, and returns a list of two
     * lists, where the first list contains the elements that are in the first array
     * but not in the second array, and the second list contains the elements that
     * are in the second array but not in the first array.
     * The method uses HashSet to store the unique elements of the arrays, and uses
     * the removeAll method to find the difference between the sets.
     *
     * @param nums1 - the first integer array
     * @param nums2 - the second integer array
     * @return a list of two lists, where the first list contains the elements that
     *         are in nums1 but not in nums2, and the second list contains the
     *         elements that are in nums2 but not in nums1
     */
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            set2.add(num);
        }

        HashSet<Integer> tempSet = new HashSet<>(set1);
        set1.removeAll(set2);
        set2.removeAll(tempSet);

        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>(set1));
        result.add(new ArrayList<>(set2));

        return result;
    }

    /**
     * Main method
     * This method is the entry point for the program. It creates two integer arrays
     * and finds the difference between them using the findDifference method.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 3 };
        int[] nums2 = { 1, 1, 2, 2 };
        List<List<Integer>> result = findDifference(nums1, nums2);
        System.out.println(result); // Output: [[3], []]
    }
}