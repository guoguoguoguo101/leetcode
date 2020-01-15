package leetcode;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }

    private ArrayList ln = new ArrayList();
    private TreeNode t1 = this;


    //前序遍历
    private ArrayList preorder(TreeNode t1) {
        if (t1 != null) {
            ln.add(t1.val) ;
            preorder(t1.left);
            preorder(t1.right);
        }
        return  ln;
    }

    public ArrayList pre() {
        ln = new ArrayList();
      return preorder(t1);
    }

    //中序遍历
    public ArrayList middleorder(TreeNode t1) {
        if (t1 != null) {
            preorder(t1.left);
            ln.add(t1.val);
            preorder(t1.right);
        }
        return  ln;
    }

    public ArrayList middle() {
        ln = new ArrayList();
        return middleorder(t1);
    }


    //后序遍历
    public ArrayList postorder(TreeNode t1) {
        if (t1 != null) {
            preorder(t1.left);
            preorder(t1.right);
            ln.add(t1.val);
        }
        return  ln;
    }
    public ArrayList post() {
        ln = new ArrayList();
        return postorder(t1);
    }


}
