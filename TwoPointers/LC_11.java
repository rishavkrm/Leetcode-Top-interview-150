package TopInterview150.TwoPointers;

public class LC_11 {

    public static void main(String[] args){
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        int result = 0;
        int left = 0;
        int right = height.length-1;
        while(left < right){
            result = Math.max(result, Math.min(height[left], height[right])*(right-left));
            if(height[left] > height[right]){
                right -= 1;
                continue;
            }
            left += 1;
        }
        return result;
    }
}
