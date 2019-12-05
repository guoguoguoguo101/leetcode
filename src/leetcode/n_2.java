package leetcode;

public class n_2 {

    public  static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        System.out.println(l1.val);
        System.out.println(l2.val);

        ListNode l3 = new ListNode(0);
        ListNode p = l1,q = l2,current = l3;

        int carry = 0;
        while (p!=null||q!=null){
            int x = (p!=null)?p.val:0;
            int y = (q!=null)?q.val:0;

            int sum = x+y+carry;
            carry = sum/10;
            current.next = new ListNode(sum%10);
            current = current.next;
            if (p!=null) p=p.next;
            if (q!=null) q=q.next;
            if (p==null&&q==null){
                if (carry>0){
                    current.next = new ListNode(carry);
                }
            }
        }

    return  l3.next;
    }
    public static void main(String[] args) {

        ListNode l1  = new ListNode(1);
         l1.next = new ListNode(3);
         l1.next.next = new ListNode(55);
          String bb =l1.toString();

        System.out.println(l1);





    }
}
