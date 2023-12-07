/**
 * Class RangeSumQuery
 * This class provides a method to calculate the sum of elements between indices
 * left and right inclusive in an array.
 */
public class RangeSumQuery {

    /**
     * Class NumArray
     * This class provides methods to calculate the prefix sum of an array and to
     * calculate the sum of elements between indices left and right inclusive.
     */
    public class NumArray {
        private int[] prefixSum;

        /**
         * Constructor NumArray
         * This constructor takes an integer array as input, and calculates the prefix
         * sum of the array.
         *
         * @param nums - the integer array
         */
        public NumArray(int[] nums) {
            prefixSum = new int[nums.length + 1];
            int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
                prefixSum[i + 1] = sum;
            }
        }

        /**
         * Method sumRange
         * This method takes two indices as input, and returns the sum of elements
         * between the indices inclusive.
         *
         * @param left  - the left index
         * @param right - the right index
         * @return the sum of elements between the indices inclusive
         */
        public int sumRange(int left, int right) {
            return prefixSum[right + 1] - (left == 0 ? 0 : prefixSum[left]);
        }
    };

    /**
     * Main method
     * This method is the entry point for the program. It creates an integer array,
     * calculates the prefix sum of the array, and calculates the sum of elements
     * between various indices.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        int[] nums = { -2, 0, 3, -5, 2, -1 };
        RangeSumQuery rsq = new RangeSumQuery();
        NumArray na = rsq.new NumArray(nums);
        System.out.println(na.sumRange(0, 2)); // Output: 1
        System.out.println(na.sumRange(2, 5)); // Output: -1
        System.out.println(na.sumRange(0, 5)); // Output: -3
    }
}