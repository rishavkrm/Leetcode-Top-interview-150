package TopInterview150.TwoPointers;

public class LC_167 {
    public static void main(String[] args) {
        
    }
    public static int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length-1;
        while(i<j){
            if(numbers[i] + numbers[j] == target){
                int[] result = {i+1, j+1};
                return result;
            }
            else if(numbers[i] + numbers[j] < target){
                i += 1;
            }   
            else{
                j -= 1;
            }
                
        }
        int[] result = {-1, -1};
        return result;
            
        }
    
}
