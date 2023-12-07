/**
 * Class RemoveDuplicatesFromSortedArray
 * This class provides a method to remove duplicates from a sorted array.
 */
class RemoveDuplicatesFromSortedArray {

    /**
     * Method removeDuplicates
     * This method takes a sorted integer array as input, and removes duplicates
     * from the array.
     * The method iterates through the array and keeps track of the current unique
     * number. If the current number is greater than the current unique number, it
     * replaces the next number in the array with the current number.
     *
     * @param nums - the sorted integer array
     * @return the length of the array after duplicates have been removed
     */
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int n : nums) {
            if (i == 0 || n > nums[i - 1]) {
                nums[i++] = n;
            }
        }
        return i;
    }

    /**
     * Main method
     * This method is the entry point for the program. It creates a sorted integer
     * array, removes duplicates from the array using the removeDuplicates method,
     * and prints the unique numbers in the array.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        int[] nums = { 1, 1, 2 };
        int len = removeDuplicates(nums);
        for (int i = 0; i < len; i++) {
            System.out.println(nums[i]);
        }
    }
}