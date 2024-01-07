package TopInterview150.Array_String;

public class LC_28 {
    public static void main(String[] args) {
        String haystack = "leetcode";
        String needle = "eet";
        System.out.println(strStr(haystack, needle));
    }
    public static int strStr(String haystack, String needle) {
        int left = 0;
        int right = needle.length();
        while(right <= haystack.length()){
            if(haystack.substring(left, right).equals(needle)){
                return left;
            }
            left += 1;
            right += 1;
        }
        return -1;
    }
}
