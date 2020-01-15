package leetcode;

public class n_461 {
    public int hammingDistance(int x, int y) {
            int t = x ^ y;
            int count = 0;
            while (t!=0){
                int c = t&1;
                if (c==1){
                    count++;
                }
                t = t>>1;
            }
            return count;
    }
}
