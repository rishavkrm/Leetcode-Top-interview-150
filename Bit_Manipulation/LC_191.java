package TopInterview150.Bit_Manipulation;

public class LC_191 {
    public static void main(String[] args) {
        System.out.println(hammingWeight(429496729));
    }
    public static int hammingWeight(int n) {
        int count = 0;
        for(int x = 0; x < 32; x++){
            int currentLastBit = n&1;
            if(currentLastBit == 1){
                count += 1;
            }
            n = n >> 1;
        }
        return count;
    }
}
