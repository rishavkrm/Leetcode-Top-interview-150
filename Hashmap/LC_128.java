package TopInterview150.Hashmap;

import java.util.HashMap;
import java.util.Map;

public class LC_128 {
    public static void main(String[] args) {
        int[] nums = {0,3,7,2,5,8,4,6,0,1};
        longestConsecutive(nums);
    }
    public static int longestConsecutive(int[] nums) {
        Map<Integer, Integer> hashmap = new HashMap<>();
        for (int i : nums) {
            hashmap.put(i, 0);
        }
        int maxLength = 0;
        for(int num : nums){
            
            if(hashmap.containsKey(num)){
                int left = 0;
                int right = 0;
                int x = num-1;
                while (hashmap.containsKey(x)) {
                    left -= 1;
                    hashmap.remove(x);
                    x -= 1;

                }
                int y = num+1;
                while (hashmap.containsKey(y)) {
                    right += 1;
                    hashmap.remove(y);
                    y += 1;

                }
                maxLength = Math.max(maxLength, right-left+1);
                
            }
        }
        return maxLength;

    }
}
