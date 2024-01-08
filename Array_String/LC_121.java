package TopInterview150.Array_String;

public class LC_121 {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;
        for(int p : prices){
            min = p < min ? p : min;
            profit = (p-min>profit) ? p-min : profit;
        }
        return profit;
    }
}
