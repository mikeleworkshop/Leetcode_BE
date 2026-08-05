class Solution {
    static int maxProfit(int[] prices) {
        int buy = 0;

        int maxProfit = 0;
        for (int sell = 1; sell < prices.length; sell++) {
            if (prices[buy] > prices[sell]) {
                buy = sell;
                sell++;
            } else {
                maxProfit = Math.max(maxProfit, 
                prices[sell] - prices[buy]);
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {10, 1, 5, 6, 7, 1};

        System.out.print(maxProfit(prices));
    }
}
