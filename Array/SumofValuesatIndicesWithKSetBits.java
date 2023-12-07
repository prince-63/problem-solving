import java.util.List;

/**
 * Class SumofValuesatIndicesWithKSetBits
 * This class provides methods to calculate the sum of values at indices with k set bits.
 */
public class SumofValuesatIndicesWithKSetBits {

    /**
     * Method countSetBits
     * This method takes an integer as input, and returns the count of set bits in the binary representation of the integer.
     *
     * @param num - the input integer
     * @return the count of set bits in the binary representation of the integer
     */
    public static int countSetBits(int num) {
        int count = 0;
        while (num > 0) {
            count += num & 1;
            num >>= 1;
        }

        return count;
    }

    /**
     * Method sumIndicesWithKSetBits
     * This method takes a list of integers and an integer k as input, and returns the sum of values at indices with k set bits.
     * The method iterates through the list and checks if the count of set bits in the binary representation of the index is equal to k. If it is, the method adds the value at the index to the sum.
     *
     * @param nums - the list of integers
     * @param k - the number of set bits
     * @return the sum of values at indices with k set bits
     */
    public static int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;

        for (int i = 0; i < nums.size(); i++) {
            if (countSetBits(i) == k) {
                sum += nums.get(i);
            }
        }

        return sum;
    }

    /**
     * Main method
     * This method is the entry point for the program. It creates a list of integers and an integer k, and calculates the sum of values at indices with k set bits using the sumIndicesWithKSetBits method.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4, 5);
        int k = 1;

        System.out.println(sumIndicesWithKSetBits(nums, k));
    }
}