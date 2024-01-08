package TopInterview150.Array_String;

public class LC_238 {
    public int[] productExceptSelf(int[] nums) {
        int countZero = 0;
        int ind = 0;
        for(int i = 0; i< nums.length; i++){
            if(nums[i]== 0 && countZero == 0){
                ind = i;
                countZero += 1;
            }
            else if(nums[i] == 0 && countZero > 0){
                for(int j = 0; j<nums.length; j++){
                    nums[j] = 0;
                }
                return nums;
            }
        }
        if(countZero == 1){
            int p = 1;
            for(int j = 0; j<nums.length; j++){
                if(j != ind){
                    p *= nums[j]; 
                }
            }
            for(int j = 0; j<nums.length; j++){
                    nums[j] = 0;
                }
            nums[ind] = p;
            return nums;
        }
        int[] forwardRunningProductArray = new int[nums.length];
        int[] backwardRunningProductArray = new int[nums.length];
        forwardRunningProductArray[0] = 1;
        backwardRunningProductArray[nums.length-1] = 1;
        int f = 1;
        int b = 1;
        for(int i = 1; i<nums.length; i++){
            f *= nums[i-1];
            forwardRunningProductArray[i] = f;
            b *= nums[nums.length - i];
            backwardRunningProductArray[nums.length-1-i] = b;

        }
        for(int i = 0; i<nums.length; i++){
            nums[i] = backwardRunningProductArray[i]*forwardRunningProductArray[i];
        }
        
        return nums;
    }
}
