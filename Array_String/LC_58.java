package TopInterview150.Array_String;

public class LC_58 {
    public int lengthOfLastWord(String s) {
        int start;
        int end;
        int i = s.length()-1;
        while(i>=0 && s.charAt(i) == ' '){
            i-=1;
        }
        end = i;
        while(i>=0 && s.charAt(i) != ' '){
            i-= 1;
        }
        start = i;
        return end-start;
    }
}
