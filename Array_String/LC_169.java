package TopInterview150.Array_String;

public class LC_169 {
    public static int majorityElement(int[] nums) {
        int candidate = nums[0]+1;
        int count = 0;
        for(int n : nums){
            if(n == candidate){
                count += 1;
            }
            else{
                if(count > 0){
                    count -= 1;
                }
                else{
                    count = 0;
                    candidate = n;
                }
            }
        }
        return candidate;
    }
}
