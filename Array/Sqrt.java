/**
 * Class Sqrt
 * This class provides a method to calculate the square root of an integer.
 */
public class Sqrt {

    /**
     * Method mySqrt
     * This method takes an integer as input, and returns the square root of the integer.
     * The method uses a binary search algorithm to find the square root. It starts with the range [1, x] and keeps narrowing down the range until it finds the square root.
     *
     * @param x - the input integer
     * @return the square root of the input integer
     */
    public static int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        int left = 1, right = x;
        while (true) {
            int mid = left + (right - left) / 2;
            if (mid > x / mid) {
                right = mid - 1;
            } else {
                if (mid + 1 > x / (mid + 1)) {
                    return mid;
                }
                left = mid + 1;
            }
        }
    }

    /**
     * Main method
     * This method is the entry point for the program. It creates an integer and calculates the square root of the integer using the mySqrt method.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        int x = 2147395599;
        System.out.println(mySqrt(x));
    }
}