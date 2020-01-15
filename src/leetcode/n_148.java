package leetcode;

public class n_148 {  //切成一个一个的 节点  然后 拼起来 排序
    public static ListNode sortList(ListNode head){
        if (head==null||head.next==null){
            return head;
        }
        ListNode fast = head.next;
        ListNode slow = head;
        while (fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow =slow.next;
        }
        ListNode tmp = slow.next;
        slow.next = null;

        ListNode left = sortList(head);
        ListNode right = sortList(tmp);
        System.out.println("merge"+left.val+right.val);
        return merge(left,right);

    }

    public static ListNode merge(ListNode left,ListNode right){
        //临时头节点
        ListNode tmpHead = new ListNode(-1);
        ListNode p = tmpHead;
        while (left != null && right != null){
            if (left.val<right.val){
                p.next = left;
                p = p.next;
                left = left.next;
            }else {
                p.next = right;
                p = p.next;
                right =right.next;
            }
        }
        p.next = left==null?right:left;
        return tmpHead.next;
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(3);
        l1.next = new ListNode(17);
        l1.next.next= new ListNode(6);
        l1.next.next.next = new ListNode(11);
        l1.next.next.next.next = new ListNode(2);
        l1.next.next.next.next.next = new ListNode(44);
        l1.next.next.next.next.next.next = new ListNode(55);
        System.out.println(l1);


        System.out.println(sortList(l1));
    }
}
