package leetcode;

public class n_344 {

    public void reverseString(char[] s) {

        int left = 0;
        int right = s.length-1;
        for (int i=0;i<s.length/2;i++){
            char cc = s[left];
            s[left] = s[right];
            s[right] = cc;
              left++;
              right--;

        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        char[] s = {97,98,99,100};
        StringBuffer s1 =new StringBuffer(new String(s));
        s1.reverse();
        System.out.println(s1);
        new n_344().reverseString(s);
    }
}
