/**
 * Class Solution
 * This class provides methods to find the maximum element and the majority
 * element in an array of integers.
 */
class Solution {

    /**
     * Method findMax
     * This method takes an array of integers as input, and returns the maximum
     * element.
     *
     * @param nums - the array of integers
     * @return the maximum element
     */
    public int findMax(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        return max;
    }

    /**
     * Method majorityElement
     * This method takes an array of integers as input, and returns the majority
     * element.
     * The majority element is the element that appears more than n/2 times, where n
     * is the length of the array.
     * The method uses a count array to count the occurrences of each element, and
     * then iterates through the count array to find the element with the maximum
     * count.
     *
     * @param nums - the array of integers
     * @return the majority element
     */
    public int majorityElement1(int[] nums) {
        int max = findMax(nums);

        int[] count = new int[max + 1];

        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }

        int maxCount = 0;
        int n = nums.length / 2;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > n) {
                maxCount = i;
            }
        }

        return maxCount;
    }

    /**
     * Method majorityElement
     * This method takes an array of integers as input, and returns the majority
     * element.
     * The majority element is the element that appears more than n/2 times, where n
     * is the length of the array.
     * The method uses a voting algorithm to find the majority element.
     *
     * @param nums - the array of integers
     * @return the majority element
     */
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                candidate = nums[i];
            }

            if (nums[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}

/**
 * Class MajorityElement
 * This class is the entry point for the program. It creates an array of
 * integers, and prints the majority element in the array.
 */
class MajorityElement {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println(solution.majorityElement(nums));
    }
}