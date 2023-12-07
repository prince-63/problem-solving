import java.util.*;

public class MaximumConsecutiveGaps {
    /**
     * This method calculates the maximum gap between consecutive numbers in a list.
     * It uses the bucket sort concept to achieve this.
     *
     * @param a The list of integers
     * @return The maximum gap between consecutive numbers
     */
    public static int maximumGap(final List<Integer> a) {
        int n = a.size();

        // If the list has less than 2 elements, there is no gap
        if (n < 2) {
            return 0;
        }

        // Initialize the minimum and maximum values
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Find the minimum and maximum values in the list
        for (int i = 0; i < n; i++) {
            min = Math.min(min, a.get(i));
            max = Math.max(max, a.get(i));
        }

        // Initialize the buckets for maximum and minimum values
        int[] bucketMaxima = new int[n - 1];
        Arrays.fill(bucketMaxima, Integer.MIN_VALUE);

        int[] bucketMinima = new int[n - 1];
        Arrays.fill(bucketMinima, Integer.MAX_VALUE);

        // Calculate the size of each bucket
        float delta = (float) (max - min) / (float) (n - 1); // output : 4.5

        // Assign numbers to buckets
        for (int i = 0; i < n; i++) {
            if (a.get(i) == min || a.get(i) == max) {
                continue;
            }

            int index = (int) ((a.get(i) - min) / delta); // output : 0, 1, 2, 3

            bucketMaxima[index] = Math.max(bucketMaxima[index], a.get(i)); // output : 1, 5, 10
            bucketMinima[index] = Math.min(bucketMinima[index], a.get(i)); // output : 1, 5, 10
        }

        // Calculate the maximum gap
        int prev = min;
        int maxGap = 0;

        for (int i = 0; i < n - 1; i++) {
            if (bucketMaxima[i] == Integer.MIN_VALUE && bucketMinima[i] == Integer.MAX_VALUE) {
                continue;
            }

            maxGap = Math.max(maxGap, bucketMinima[i] - prev);
            prev = bucketMaxima[i];
        }

        maxGap = Math.max(maxGap, max - prev);
        return maxGap;
    }

    public static void main(String[] args) {
        List<Integer> A = new ArrayList<Integer>();
        A.add(1);
        A.add(10);
        A.add(5);
        System.out.println(maximumGap(A)); // Should print "5"
    }
}