package TopInterview150.Sliding_window;


public class LC_209 {
    public static void main(String[] args) {
        int target = 11;
        int[] nums = {1,2,3,4,5};
        System.out.println(minSubArrayLen(target, nums));
    }
    public static int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        for(int i : nums){
            sum += i;
        }
        if(sum < target){
            return 0;
        }
        int left = 0;
        int right = 0;
        int curr = 0;
        int min = nums.length;
        while(right<nums.length){
            while(curr < target && right < nums.length){
                curr += nums[right];  
                if(right < nums.length){
                    right += 1;  
                }
                
            }            
            while(curr >= target && left < right){
                min = Math.min(right-left, min);
                curr -= nums[left];
                left += 1;
                
            }
        }
        return min;

    }
}
