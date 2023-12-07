import java.util.PriorityQueue;

/**
 * Class MaximumSumWithExactlyKElements
 * This class provides methods to calculate the maximum sum with exactly k
 * elements.
 */
public class MaximumSumWithExactlyKElements {

    /**
     * Method maximizeSum
     * This method takes an array of integers and an integer k, and returns the
     * maximum sum with exactly k elements.
     * Time complexity: O(k log n), where n is the length of the nums array, due to
     * the use of a priority queue.
     * Space complexity: O(n), as a priority queue of the same size as the input is
     * created.
     *
     * @param nums - the array of integers
     * @param k    - the number of elements to consider
     * @return the maximum sum with exactly k elements
     */
    public static int maximizeSum(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int num : nums) {
            pq.add(num);
        }
        int sum = 0;
        while (k-- > 0) {
            int max = pq.poll();
            sum += max;
            pq.add(max + 1);
        }
        return sum;
    }

    /**
     * Main method
     * This method is the entry point for the program. It creates an array of
     * integers and an integer k, and uses the maximizeSum method to calculate the
     * maximum sum with exactly k elements.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        int[] nums = { 4, 2, 1, 7, 8, 1, 2, 8, 1, 0 };
        int k = 3;
        System.out.println(maximizeSum(nums, k)); // Output: 16
    }
}