package leetcode;

import java.util.HashMap;
import java.util.Map;
//大概知道怎么做
//但自己写真的写不出来 哭了
public class n_3 {
    public static int lengthOfLongestSubstring(String s) {


        int length = 0;
        Map<Character,Integer> map = new HashMap<>();
       for (int start = 0,end = 0;end<s.length();end++){
           char c  = s.charAt(end);

           if (map.containsKey(c)){
                start = Math.max(start,map.get(c));
           }
           length = Math.max(length, end - start + 1);
           map.put(c,end+1);

       }

        return length;
    }

    public static void main(String[] args) {
        String bb = "aaacder";
            int t =lengthOfLongestSubstring(bb);
        System.out.println(t);
    }
}
