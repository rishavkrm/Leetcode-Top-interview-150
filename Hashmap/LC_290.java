package TopInterview150.Hashmap;

import java.util.HashMap;
import java.util.Map;

public class LC_290 {
    public static void main(String[] args) {
        String pattern = "ab"; String s = "dog dog";
        wordPattern(pattern,s);
    }

    public static boolean wordPattern(String pattern, String s) {
        
        String[] stringArray = s.split(" ");
        if(stringArray.length != pattern.length()){
            System.err.println(stringArray.length + " " + s.length());
            return false;
        }
        Map<String, Character> hashMap1 = new HashMap<>();
        Map<Character, String> hashMap2 = new HashMap<>();
        for (int i = 0; i < stringArray.length; i++) {
            if (!hashMap1.containsKey(stringArray[i])) {
                hashMap1.put(stringArray[i], pattern.toCharArray()[i]);
                //System.out.println(pattern.toCharArray()[i] + " " +stringArray[i]);
            }
            if (!hashMap2.containsKey(pattern.toCharArray()[i%pattern.length()])) {
                hashMap2.put(pattern.toCharArray()[i%pattern.length()],stringArray[i]);
                //System.out.println(pattern.toCharArray()[i] + " " +stringArray[i]);
            }
        }
        for (int i = 0; i < stringArray.length; i++) {
            if(!hashMap1.get(stringArray[i]).equals(pattern.toCharArray()[i%pattern.length()])){
                System.out.println(false);
                return false;
            }
            if(!hashMap2.get(pattern.toCharArray()[i%pattern.length()]).equals(stringArray[i])){
                System.out.println(false);
                return false;
            }
        }

        System.out.println(true);
        return true;
    }
}
