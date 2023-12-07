public class BestTimeToBuyAndSellStockTwo {
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public int maxProfit(int[] arr) {
        int len = arr.length;
        int result = 0;

        for (int i = 1; i < len; i++) {
            if (arr[i] > arr[i - 1]) {
                result += arr[i] - arr[i - 1];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStockTwo bttbass = new BestTimeToBuyAndSellStockTwo();
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        System.out.println(bttbass.maxProfit(prices));
    }
}
