import java.util.*;

// Given an array of integers and an integer k, you need to find the total number of continuous subarrays whose sum equals to k.
public class SubArraySum {
    public static int subarraySum(int[] nums, int k) {
        // brute force solution
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;

            for (int j = i; j < nums.length; j++) {
                sum += nums[j];

                if (sum == k) {
                    count++;
                }
            }
        }

        return count;
        // optimized solution
        // int count = 0;
        // int sum = 0;
        // HashMap<Integer, Integer> map = new HashMap<>();

        // map.put(0, 1);

        // for (int i = 0; i < nums.length; i++) {
        //     sum += nums[i];

        //     if (map.containsKey(sum - k)) {
        //         count += map.get(sum - k);
        //     }

        //     System.out.println("sum: " + sum + " count: " + count);
        //     System.out.println("map: " + map);

        //     map.put(sum, map.getOrDefault(sum, 0) + 1);
        // }

        // return count;
    }

    public static void main(String[] args) {
        int[] nums = { 1, -1, 0 };
        int k = 0;

        System.out.println(subarraySum(nums, k));
    }
}