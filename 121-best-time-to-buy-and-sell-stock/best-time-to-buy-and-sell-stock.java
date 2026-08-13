class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int max_profit = 0;
        for(int  i=0; i<prices.length; i++){
            if(prices[i]<min){
                min = prices[i];
            }
            else if(prices[i]>min){
                int profit = prices[i]-min;
                if(profit>max_profit){
                max_profit=profit;
            }
        }
    }
     return max_profit;
  }
}