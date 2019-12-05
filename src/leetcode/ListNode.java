package leetcode;

public class ListNode {
    int val;
    ListNode next;
    ListNode( int x){
        val = x;
    }



    @Override
    public String toString() {

        StringBuffer s1 = new StringBuffer();

        ListNode l1 = this;

        while (l1!=null){
            s1.append(l1.val+"---");
            l1= l1.next;
        }
        return s1.toString();


    }
}
