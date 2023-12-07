/**
 * Class ClimbingStairs
 * This class provides a method to calculate the number of distinct ways to climb a staircase.
 */
public class ClimbingStairs {

    /**
     * Method climbStairs
     * This method takes an integer n as input, which represents the total number of steps in the staircase, and calculates the number of distinct ways to climb the staircase.
     * Each time, you can either climb 1 or 2 steps.
     *
     * @param n - the total number of steps in the staircase
     * @return the number of distinct ways to climb the staircase
     */
    public static int climbStairs(int n) {
        if (n <= 2) return n;
        int[] dp = new int[n+1];
        dp[1] = 1; dp[2] = 2;
        for (int i=3; i<=n; i++) {
            dp[i] = dp[i-2] + dp[i-1];
        }
        return dp[n];
    }

    /**
     * Main method
     * This method is the entry point for the program. It creates an integer n and calculates the number of distinct ways to climb a staircase with n steps using the climbStairs method.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        System.out.println(climbStairs(3));  // Output: 3
    }
}