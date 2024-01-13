package TopInterview150.Hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC_49 {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        groupAnagrams(strs);
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, ArrayList<String>> hashmap = new HashMap<>();
        List<List<String>> result = new ArrayList<>();
        for (String string : strs) {
            char[] charArray = string.toCharArray();
            Arrays.sort(charArray);
            String temp = new String(charArray);
            if (hashmap.containsKey(temp)) {
                ArrayList<String> tempA = hashmap.get(temp);
                tempA.add(string);
                hashmap.put(temp, tempA);
            } else {
                ArrayList<String> tempA = new ArrayList<>();
                tempA.add(string);
                hashmap.put(temp, tempA);
            }
        }
        for (String key : hashmap.keySet()) {
            System.err.println(hashmap.get(key));
            result.add(hashmap.get(key));
        }
        
        return result;

    }

}
