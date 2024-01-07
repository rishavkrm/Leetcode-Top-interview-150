package TopInterview150.TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class LC_15 {
    public static void main(String[] args) {
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {

                int l = i + 1;
                int r = nums.length - 1;
                while (l < r) {
                    if (nums[l] + nums[r] + nums[i] == 0 && r != l) {
                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[l]);
                        temp.add(nums[r]);
                        res.add(temp);

                        while (l < r && nums[l] == nums[l + 1])
                            l++;
                        while (l < r && nums[r] == nums[r - 1])
                            r--;
                        l += 1;
                        r -= 1;
                        continue;
                    } else if (nums[l] + nums[r] + nums[i] > 0) {
                        r -= 1;
                    } else {
                        l += 1;
                    }
                }
            }
        }
        return res;
    }
} 