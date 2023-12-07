import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Class SubArraysDistinctElement
 * This class provides a method to calculate the sum of the squares of distinct counts of all subarrays of a list of integers.
 */
public class SubArraysDistinctElement {

    /**
     * Method sumCounts
     * This method takes a list of integers as input, and calculates the sum of the squares of distinct counts of all subarrays.
     * For each subarray, it calculates the number of distinct elements, squares it, and adds it to the total sum.
     *
     * @param nums - a list of integers
     * @return the sum of the squares of distinct counts of all subarrays
     */
    public static int sumCounts(List<Integer> nums) {
        int ans = 0;
        for(int i=0; i<nums.size(); i++){
            HashSet<Integer> hs = new HashSet<>();
            for(int j=i; j<nums.size(); j++){
                hs.add(nums.get(j));
                ans += (hs.size()*hs.size());
            }
        }
        return ans;
    }

    /**
     * Main method
     * This method is the entry point for the program. It creates a list of integers and calculates the sum of the squares of distinct counts of all subarrays using the sumCounts method.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(2);
        nums.add(1);

        System.out.println(sumCounts(nums));
    }
}