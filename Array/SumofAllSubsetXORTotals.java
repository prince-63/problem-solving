import java.util.ArrayList;

public class SumofAllSubsetXORTotals {

    public static int sumOfAllSubsetXORTotals(int[] nums) {
        int sum = 0;
        int size = nums.length;
        ArrayList<ArrayList<Integer>> subsets = new ArrayList<ArrayList<Integer>>();

        // Find all subsets of the array
        for (int i = 0; i < (1 << size); i++) {
            ArrayList<Integer> subset = new ArrayList<Integer>();
            for (int j = 0; j < size; j++) {
                if ((i & (1 << j)) > 0) {
                    subset.add(nums[j]);
                }
            }
            subsets.add(subset);
        }

        // Calculate the XOR total of each subset
        for (ArrayList<Integer> subset : subsets) {
            int xorTotal = 0;
            for (int num : subset) {
                xorTotal ^= num;
            }
            sum += xorTotal;
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2 };
        System.out.println(sumOfAllSubsetXORTotals(nums));
    }
}
