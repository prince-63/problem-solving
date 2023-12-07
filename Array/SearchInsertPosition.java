/**
 * Class SearchInsertPosition
 * This class provides a method to find the index at which a target number would be if it were inserted in order.
 */
public class SearchInsertPosition {

    /**
     * Method searchInsert
     * This method takes an integer array and a target integer as input, and returns the index at which the target would be if it were inserted in order.
     * The method uses a binary search algorithm to find the target or the insertion point in the array.
     *
     * @param nums - the integer array
     * @param target - the target integer
     * @return the index at which the target would be if it were inserted in order
     */
    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return left;
    }

    /**
     * Main method
     * This method is the entry point for the program. It creates an integer array and a target integer, and finds the index at which the target would be if it were inserted in order using the searchInsert method.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        System.out.println(searchInsert(nums, target));  // Output: 2
    }
}