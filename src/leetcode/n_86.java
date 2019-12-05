package leetcode;

public class n_86 {

    public ListNode partition(ListNode head, int x) {

        ListNode before_head = new ListNode(0);
        ListNode before = before_head;

        ListNode after_head = new ListNode(0);
        ListNode after = after_head;

        while (head!=null){
            if (head.val<x){
                before.next = new ListNode(head.val);
                before = before.next;
            }else {
                after.next = new ListNode(head.val);
                after = after.next;
            }

            head = head.next;
        }

        before.next = after_head.next;


        return before_head.next;

    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(5);
        ListNode l3 = new ListNode(6);
        ListNode l4 = new ListNode(8);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;

        new n_86().partition(l1, 5);
    }


}
