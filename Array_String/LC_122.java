package TopInterview150.Array_String;

public class LC_122 {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for(int i = 0; i<prices.length-1; i++){
            profit = prices[i+1] - prices[i] > 0? profit+prices[i+1] - prices[i]:profit;
        }
        return profit;
    }
}
