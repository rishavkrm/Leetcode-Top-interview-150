package TopInterview150.Array_String;

public class LC_26 {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        removeDuplicates(nums);
    }

    public static int removeDuplicates(int[] nums) {
        int count = 0;
        int curr = 101;
        int x = 0;
        int y = 0;
        while (x < nums.length) {
            if (nums[x] != curr) {
                curr = nums[x];
                count += 1;
                x += 1;
                y += 1;
            } else {
                while (x < nums.length && nums[x] == curr) {
                    x += 1;
                }
                System.out.println(x);
                if (x < nums.length) {
                    nums[y] = nums[x];
                    y += 1;
                    curr = nums[x];
                    count += 1;
                }

            }
        }
        for (int num : nums) {
            System.out.print(num + " ");
        }
        return count;
    }

}
