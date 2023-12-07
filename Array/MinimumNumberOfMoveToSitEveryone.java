import java.util.Arrays;

/**
 * Class MinimumNumberOfMoveToSitEveryone
 * This class provides methods to calculate the minimum number of moves to seat
 * everyone.
 */
public class MinimumNumberOfMoveToSitEveryone {

    /**
     * Method minMovesToSeat
     * This method takes two arrays of integers, representing the seats and the
     * students, and returns the minimum number of moves to seat everyone.
     * Time complexity: O(n log n), where n is the length of the seats array, due to
     * the sorting operation.
     * Space complexity: O(1), as the space used does not depend on the size of the
     * input.
     *
     * @param seats    - the array of seats
     * @param students - the array of students
     * @return the minimum number of moves to seat everyone
     */
    public static int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int res = 0;
        for (int i = 0; i < seats.length; i++) {
            res += Math.abs(seats[i] - students[i]);
        }
        return res;
    }

    /**
     * Main method
     * This method is the entry point for the program. It creates two arrays of
     * integers, representing the seats and the students, and uses the
     * minMovesToSeat method to calculate the minimum number of moves to seat
     * everyone.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        int[] seats = { 3, 1, 5 };
        int[] students = { 2, 7, 4 };
        System.out.println(minMovesToSeat(seats, students)); // Output: 4
    }
}