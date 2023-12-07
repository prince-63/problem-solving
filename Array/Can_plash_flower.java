/**
 * Class Solution
 * This class provides a method to check if n new flowers can be planted in a flowerbed without violating the no-adjacent-flowers rule.
 */
class Solution {
    /**
     * Method canPlaceFlowers
     * This method takes a flowerbed represented as an integer array and an integer n as input, and checks if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule.
     * Each element in the flowerbed array is either 0 (empty) or 1 (occupied), and flowers cannot be planted in adjacent plots.
     *
     * @param flowerbed - an integer array representing the flowerbed
     * @param n - the number of new flowers to be planted
     * @return true if n new flowers can be planted, false otherwise
     */
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length && n > 0; i++) {
            if (flowerbed[i] == 0) {
                if ((i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                    flowerbed[i] = 1;
                    n--;
                }
            }
        }
        return n <= 0;
    }
}

/**
 * Class Can_plash_flower
 * This class tests the canPlaceFlowers method of the Solution class.
 */
public class Can_plash_flower {
    /**
     * Main method
     * This method is the entry point for the program. It creates a flowerbed and an integer n, and checks if n new flowers can be planted in the flowerbed using the canPlaceFlowers method of the Solution class.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 2;
        System.out.println(solution.canPlaceFlowers(flowerbed, n));  // Output: true
    }
}