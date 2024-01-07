package TopInterview150.TwoPointers;

public class LC_125 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        // char[] arr = s.toCharArray();
        int left = 0;
        int right = s.length()-1;
        s = s.toLowerCase();
        while(left < right){
            if(!Character.isLetterOrDigit(s.charAt(right))){
                right -= 1;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(left))){
                left += 1;
                continue;
            }
            if((s.charAt(right)) != s.charAt(left)){
                return false;
            }
            right -= 1;
            left += 1;
        }
        return true;
    }
    
}
