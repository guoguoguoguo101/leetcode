package leetcode;

import java.util.jar.JarEntry;

public class n_14 {

    public String longestCommonPrefix(String[] strs){

        String ans = strs[0];
        for (int i=1;i<strs.length;i++){
         String s0 = strs[i];
         int j = 0;
            for (;j<s0.length()&&j<ans.length();j++){
                if (ans.charAt(j)!=s0.charAt(j)){
                    break;
                }
            }
            ans = ans.substring(0,j);
            System.out.println(ans);
        }
        return ans;
    }


    public static void main(String[] args) {

        String s1 = "aaabbcc";
        String s2 = "aaddeef";
        String s3 = "aaarrtt";
        String sts[] = {s1,s2,s3};
        new n_14().longestCommonPrefix(sts);

    }
}
