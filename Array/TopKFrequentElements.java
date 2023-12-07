import java.util.*;

/**
 * Class TopKFrequentElements
 * This class provides a method to find the k most frequent elements in an
 * array.
 */
public class TopKFrequentElements {

    /**
     * Method topKFrequent
     * This method takes an integer array and an integer k as input, and returns an
     * array of the k most frequent elements.
     * The method uses a HashMap to count the frequency of each number, and a
     * PriorityQueue to keep track of the k most frequent numbers.
     *
     * @param nums - the integer array
     * @param k    - the number of most frequent elements to return
     * @return an array of the k most frequent elements
     */
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.comparingInt(count::get));
        for (int num : count.keySet()) {
            heap.add(num);
            if (heap.size() > k)
                heap.poll();
        }

        int[] top = new int[k];
        for (int i = k - 1; i >= 0; --i) {
            top[i] = heap.poll();
        }
        return top;
    }

    /**
     * Main method
     * This method is the entry point for the program. It creates an integer array
     * and an integer k, and finds the k most frequent elements in the array using
     * the topKFrequent method.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 2, 2, 3 };
        int k = 2;
        int[] result = topKFrequent(nums, k);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}