import java.util.ArrayList;
import java.util.List;

public class MaxDistance {
    /**
     * This method calculates the maximum distance between two elements in a list
     * such that the smaller element appears before the larger element.
     * It uses two auxiliary arrays to keep track of the minimum element from the
     * left and the maximum element from the right.
     *
     * @param A The list of integers
     * @return The maximum distance
     */
    public static int maximumGap(final List<Integer> A) {
        int n = A.size();
        int[] left = new int[n];
        int[] right = new int[n];

        // Initialize the first element of left array with the first element of A
        left[0] = A.get(0);
        // Fill the left array with the minimum element from the left
        for (int i = 1; i < n; i++) {
            left[i] = Math.min(A.get(i), left[i - 1]);
        }

        // Initialize the last element of right array with the last element of A
        right[n - 1] = A.get(n - 1);
        // Fill the right array with the maximum element from the right
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(A.get(i), right[i + 1]);
        }

        // Initialize pointers for left and right arrays and the maximum distance
        int x = 0, y = 0, maxDist = 0;
        // While both pointers are within the array
        while (x < n && y < n) {
            // If the element in the left array is less than or equal to the element in the
            // right array
            if (left[x] <= right[y]) {
                // Update the maximum distance
                maxDist = Math.max(maxDist, y - x);
                // Move the right pointer forward
                y++;
            } else {
                // Move the left pointer forward
                x++;
            }
        }

        // Return the maximum distance
        return maxDist;
    }

    public static void main(String[] args) {
        List<Integer> A = new ArrayList<Integer>();
        A.add(3);
        A.add(5);
        A.add(4);
        A.add(2);
        System.out.println(maximumGap(A)); // Should print "2"
    }
}