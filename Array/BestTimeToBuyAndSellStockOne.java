public class BestTimeToBuyAndSellStockOne {

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) { // find the minimum price
                minPrice = price; // output: 1
            } else if (price - minPrice > maxProfit) { // find the maximum profit
                maxProfit = price - minPrice; // output: 5
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStockOne bttbass = new BestTimeToBuyAndSellStockOne();
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        System.out.println(bttbass.maxProfit(prices));
    }
}
