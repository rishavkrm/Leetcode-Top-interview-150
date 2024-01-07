package TopInterview150.Array_String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC_68 {
    public static void main(String[] args) {
        String[] words = { "What", "must", "be", "acknowledgment", "shall", "be" };
        int maxWidth = 16;
        List<String> res = fullJustify(words, maxWidth);
        for (String s : res) {
            System.out.println(s);
        }
    }

    public static List<String> fullJustify(String[] words, int maxWidth) {
        int i = 0;
        List<String> res = new ArrayList<>();
        int x = 0;
        while (i < words.length) {
            int curr = 0;

            // System.out.println(i);
            while (i < words.length) {
                curr = curr + words[i].length() + 1;
                if (curr > maxWidth) {
                    String y = String.join(" ", Arrays.copyOfRange(words, x, i));
                    // while (y.length() < maxWidth) {
                    //     y += " ";
                    // }
                    res.add(justifyText(y, maxWidth, i-x));
                    x = i;
                    break;
                }
                i += 1;

            }
        }
        String y = String.join(" ", Arrays.copyOfRange(words, x, i));
        res.add(justifyText(y, maxWidth, i-x));

        return res;
    }
    public static String justifyText(String text, int totalWidth, int num) {
        int spacesToAdd = totalWidth - text.length();
        
        // // Calculate left and right spaces
        int leftSpaces = 0;
        int rightSpaces = 0;

        // // Create left and right padded strings
        String leftPadded = String.format("%" + (text.length() + leftSpaces) + "s", text);
        String justified = String.format("%-" + totalWidth + "s", leftPadded);

        return justified;
    }
}
