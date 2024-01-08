package TopInterview150.Array_String;

public class LC_134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        if(sumArray(cost) > sumArray(gas)){
            return -1;
        }
        int n = gas.length;
        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        int curr = 0;
        for(int i = 0; i<n; i++){
            curr = curr + gas[i] -cost[i];
            if(curr <= min){
                min = curr;
                minIndex = i;
            }
        }
        
        return (minIndex+1)%n;
    }
    public int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}
