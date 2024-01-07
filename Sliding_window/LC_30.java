package TopInterview150.Sliding_window;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC_30 {
    public static void main(String[] args) {
        String s = "wordgoodgoodgoodbestword";
        String[] words = {"word","good","best","good"};        ;
        System.out.println(findSubstring(s,words));
    }

    public static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        int window_length = words[0].length()*words.length;
        int word_length = words[0].length();
        int start = 0;
        int end = window_length-1;
        Map<String, Integer> hashMap = new HashMap<>();
        for(String str: words){
            if(hashMap.containsKey(str)){
                hashMap.put(str, hashMap.get(str) + 1);
            }
            else{
                hashMap.put(str, 1);
            }
        }
        while(end != s.length()){
            Map<String, Integer> temp = new HashMap<>();
            for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
                temp.put(entry.getKey(), entry.getValue());
            }
            for(int i = 0; i<window_length; i+=word_length){
                String curr = s.substring(i+start, start+i+word_length);
                if(temp.containsKey(curr)){
                    temp.put(curr, temp.get(curr) - 1);
                }
            }
            boolean addInResult = true;
            for (Map.Entry<String, Integer> entry : temp.entrySet()) {
                if(entry.getValue()!=0){
                    addInResult = false;
                }
            }
            if(addInResult){
                result.add(start);
            }            

            start += 1;
            end += 1;
        }
            

        return result;

    }

}
