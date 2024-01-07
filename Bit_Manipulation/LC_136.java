package TopInterview150.Bit_Manipulation;

public class LC_136 {
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int x : nums){
            res = res ^ x;
        }
        return res;
    }
}
