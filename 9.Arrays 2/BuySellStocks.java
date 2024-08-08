
public class BuySellStocks {

    public static void main(String args[]) {
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;
        int prices[] = {7, 6, 4,  3, 1};

        for (int i = 0; i < prices.length; i++) {
            if (buyPrice > prices[i]) {
                buyPrice = prices[i];
            }
            if (buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(profit, maxProfit);
            }
        }

        System.out.print("Maximum Profit : " + maxProfit);
    }
}
