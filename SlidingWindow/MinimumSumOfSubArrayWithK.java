public class MinimumSumOfSubArrayWithK {
    public static int findMinSumSubArray(int[] arr, int k) {
        int minSum = Integer.MAX_VALUE, windowSum = 0, windowStart = 0;

        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            windowSum += arr[windowEnd]; // add the next element
            // slide the window, we don't need to slide if we've not hit the required window
            // size of 'k'
            if (windowEnd >= k - 1) {
                minSum = Math.min(windowSum, minSum);
                windowSum -= arr[windowStart]; // subtract the element going out
                windowStart++; // slide the window ahead
            }
        }

        return minSum;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 5, 1, 3, 2 }; // input array
        int k = 3; // window size
        System.out.println(findMinSumSubArray(arr, k));
    }
}
