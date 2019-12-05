package leetcode;

import java.util.List;

public class n_206 {

    public ListNode reverseList(ListNode head) {

        if (head.next==null){
            return head;
        }

        ListNode l1 = reverseList(head.next);
        System.out.println(l1.val+"**");
       head.next.next = head;
       head.next = null;
        return l1;
    }

    public ListNode reverseList2(ListNode head) {

      ListNode prev = null;
      ListNode curr = head;
      while (curr!=null){

          ListNode nexttemp  = curr.next;
          curr.next =    prev;
          prev = curr;
          curr = nexttemp;
      }

      return prev;

    }


    public static void main(String[] args) {

        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(5);
        ListNode l3 = new ListNode(6);
        ListNode l4 = new ListNode(8);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        System.out.println(l1);

        System.out.println("l3.next="+l3.next.val+"***"+l3.next.hashCode());
        System.out.println("l4="+l4.val+"+l4.hashcode"+l4.hashCode());


        System.out.println(l3.next.val);



    }
}
