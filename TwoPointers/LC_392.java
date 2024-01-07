package TopInterview150.TwoPointers;

public class LC_392 {
    public static void main(String[] args) {
        String s = "";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s,t));
    }
    public static boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        while(i<t.length() && j<s.length()){
            if(s.charAt(j) == t.charAt(i)){
                j+=1;
            }
            if(j == s.length()){return true;}
            i+=1;
        }
        if(j == s.length()){
            return true;
        }
        return false;
    }
}
