package leetcode;

public class n_231 {
    public boolean isPowerOfTwo(int n) {
        return n>0&&(n&(n-1))==0;
    }

    public static void main(String[] args) {
        int i = 4;
        System.out.println(new n_231().isPowerOfTwo(i));
    }
}
