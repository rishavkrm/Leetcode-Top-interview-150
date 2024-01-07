package TopInterview150.Array_String;

public class LC_14 {
    public static void main(String[] args) {
        String[] strs = {""};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        int min = strs[0].length();
        for(String s:strs){
            min = min>s.length()?s.length():min;
        }
        int curr = 0;
        while (curr <= min) {
            String current = strs[0].substring(0, curr);
            for (String s : strs) {
                if (!s.substring(0, curr).equals(current)) {
                    return s.substring(0, curr - 1);
                }
            }
            curr += 1;
        }
        // System.out.println(curr);
        return strs[0].substring(0, curr-1);

    }
}
