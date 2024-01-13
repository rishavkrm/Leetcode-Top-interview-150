package TopInterview150.Intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC_228 {
    public static void main(String[] args) {
        int[] nums = {6};
        summaryRanges(nums);
    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if(nums.length < 1){
            return result;
        }
        Arrays.sort(nums);
        int from = nums[0];
        int to = nums[0];
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == to) {
                continue;
            } else {
                if (nums[i] == to + 1) {
                    to += 1;
                } else if ((nums[i] != to + 1)) {
                    if (from < to) {
                        result.add(from + "->" + to);
                    } else {
                        result.add("" + from);
                    }
                    ;
                    from = nums[i];
                    to = nums[i];
                }
            }
        }
        if (from < to) {
            result.add(from + "->" + to);
        } else {
            result.add("" + from);
        }
    
        System.out.println(result);
        return result;

    }

}
