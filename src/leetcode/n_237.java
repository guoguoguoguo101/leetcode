package leetcode;

public class n_237 {
    public void deleteNode(ListNode node) {
        node .val = node.next.val;
        node.next = node.next.next;
    }
}
