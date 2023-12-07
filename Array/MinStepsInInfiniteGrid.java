/**
 * Class MinStepsInInfiniteGrid
 * This class provides a method to calculate the minimum number of steps required to move from one point to another in an infinite 2D grid.
 */
public class MinStepsInInfiniteGrid {

    /**
     * Method coverPoints
     * This method takes two arrays of integers representing the x and y coordinates of points in a 2D grid.
     * It calculates the minimum number of steps required to move from the first point to the last point, visiting each point in order.
     * The method uses the formula for Chebyshev distance to calculate the number of steps.
     * Time complexity: O(n), where n is the number of points, as there is a single loop iterating over the points.
     * Space complexity: O(1), as no additional space is used.
     *
     * @param A - the array of x coordinates
     * @param B - the array of y coordinates
     * @return the minimum number of steps required to cover all points
     */
    public static int coverPoints(int[] A, int[] B) {
        int size = A.length;
        int steps = 0;

        for (int i = 0; i < size - 1; i++) {
            int x1 = A[i];
            int x2 = A[i + 1];
            int y1 = B[i];
            int y2 = B[i + 1];

            int xDiff = Math.abs(x1 - x2);
            int yDiff = Math.abs(y1 - y2);

            steps += Math.max(xDiff, yDiff);
        }

        return steps;
    }

    /**
     * Main method
     * This method is the entry point for the program. It creates two sample arrays of coordinates, calls the coverPoints method with these arrays, and prints the result.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        int[] A = { 0, 1, 1 };
        int[] B = { 0, 1, 2 };
        System.out.println(coverPoints(A, B));
    }
}