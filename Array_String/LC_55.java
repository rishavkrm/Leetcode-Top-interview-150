package TopInterview150.Array_String;

import java.util.ArrayList;

public class LC_55 {
    public static boolean canJump(int[] nums) {
        ArrayList<Integer> zeroArray = new ArrayList<Integer>();
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] == 0){
                zeroArray.add(i);
            }
        }
        System.out.println(zeroArray);
        if(zeroArray.size() == 0){
            return true;
        }
        if(nums[0] == 0){
            return false;
        }
        
        int count = 0;
        for(int i : zeroArray){
            boolean yes = false;
            int curr = 0;
            while(curr < i){
                // System.out.println(nums[curr] - i+curr);
                if((nums[curr] - i + curr)>0){
                    count += 1;
                    curr += 1;
                    yes = true;
                    break;
                }
                curr += 1;
            }
            if(!yes){
                    return false;
                }
        }
        return true;
    }
}
