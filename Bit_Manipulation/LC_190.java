package TopInterview150.Bit_Manipulation;

public class LC_190 {
    public static void main(String[] args) {
        System.out.println(reverseBits(5));
    }
    public static int reverseBits(int n) {
        int res = 0;
        int count = 0;
        while(count < 32){
            res *= 2;
            res += n&1;
            n = n >> 1; 
            count += 1;
        }
        return res;
    }
}
// 101