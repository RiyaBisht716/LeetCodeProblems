class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for(int i=1;i<prices.length;i++){
            //calculate maximum profit
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);

            //update the minPrice
            minPrice = Math.min(minPrice, prices[i]);
        }
        return maxProfit;
        
    }
}