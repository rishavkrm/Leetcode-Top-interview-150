package TopInterview150.Hashmap;

import java.util.Arrays;

public class LC_1 {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int[] temp = new int[nums.length];
        for (int k = 0; k < nums.length; k++) {
            temp[k] = nums[k];
        }
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length - 1;

        while (i < j) {
            if (nums[i] + nums[j] == target) {
                result[0] = nums[i];
                result[1] = nums[j];
                break;
            } else if (nums[i] + nums[j] < target) {
                i += 1;
            } else {
                j -= 1;
            }
        }
        int count = 0;
        boolean y = false;
        boolean z = false;
        for (int m : temp) {
            if (m == result[0] && !y) {
                result[0] = count;
                y = true;
            } else if (m == result[1] && !z) {
                result[1] = count;
                z = true;
            }
            count++;
        }
        return result;

    }
}
