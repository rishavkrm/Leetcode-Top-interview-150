package TopInterview150.Array_String;
import java.util.ArrayList;

/**
 * LC_151
 */
public class LC_151 {

    public static void main(String[] args) {
        String s = "  hello world  ";
        // reverseWords(s);
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        int n = s.length();
        int r = n - 1;
        int l = 0;
        while (r > l && s.charAt(r) == ' ') {
            r -= 1;
        }
        while (r > l && s.charAt(l) == ' ') {
            l += 1;
        }
        ArrayList<String> array = new ArrayList<>();
        while (l <= r) {

            while (l <= r && s.charAt(l) == ' ') {
                l += 1;
                continue;
            }
            int curr = l;
            while (l <= r && s.charAt(l) != ' ') {
                l += 1;
                continue;
            }
            array.add(s.substring(curr, l));
            

        }
        l = 0;
        r = array.size()-1;
        while(l<r){
            String temp = array.get(l);
            array.set(l, array.get(r));
            array.set(r, temp);
            l += 1;
            r -= 1;


        }
        s = String.join(" ", array);
        return s;

    }
}