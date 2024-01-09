package TopInterview150.Kadane_Algorithm;

public class LC_53 {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        for(int i =1; i< nums.length; i++ ){
            nums[i] += nums[i-1];
        }
        int min = 0;
        int maxSum = nums[nums.length-1];
        for (int i = 0; i < nums.length; i++) {
            maxSum = Math.max(maxSum, nums[i] - min);
            min = Math.min(min, nums[i]);
        }
        return maxSum;
    }
}
