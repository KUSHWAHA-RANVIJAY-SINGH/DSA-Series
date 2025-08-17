public class Best_Time_to_Buy_and_Sell_Stock {
    
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }
        return maxProfit;
    }
    
    public int maxProfit_v1(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }

    public int maxProfit_v2(int[] prices) {
        int mini = prices[0];
        int maxProfit = 0;
        int n = prices.length;
        for(int i =1;i<n;i++){
            int cost = prices[i] - mini;
            maxProfit = Math.max(maxProfit, cost);
            mini = Math.min(mini, prices[i]);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        
        int[] prices = {7, 1, 5, 3, 6, 4};
        Best_Time_to_Buy_and_Sell_Stock stock = new Best_Time_to_Buy_and_Sell_Stock();

        int profit = stock.maxProfit_v1(prices);
        int profit_1 = stock.maxProfit_v2(prices);
        System.out.println("Max Profit: " + profit);
        System.out.println("Max Profit: " + profit_1);
    }
}
