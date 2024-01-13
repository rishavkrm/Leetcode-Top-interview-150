package TopInterview150.Hashmap;

import java.util.HashMap;
import java.util.Map;

public class LC_205 {
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        isIsomorphic(s, t);
    }

    public static boolean isIsomorphic(String s, String t) {
        Map<Character,Character> hashmap1 = new HashMap<>();
        Map<Character,Character> hashmap2 = new HashMap<>();
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        for (int i = 0; i < arr2.length; i++) {
            hashmap1.put(arr1[i], arr2[i]);
            hashmap2.put(arr2[i], arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            if(hashmap1.get(arr1[i]) != arr2[i]){
                System.out.println(hashmap1.get(arr1[i]) + " " + arr2[i]);
                System.out.println(false);
                return false;
            }
            if(hashmap2.get(arr2[i]) != arr1[i]){
                System.out.println(hashmap2.get(arr2[i]) + " " + arr1[i]);
                System.out.println(false);
                return false;
            }

        }


        System.out.println(true);
        return true;
    }
}
