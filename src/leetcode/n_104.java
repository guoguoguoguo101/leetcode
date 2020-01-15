package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class n_104 {

    public static int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }

        //求出左节点的最大深度
        int leftMaxDepth = maxDepth(root.left);
        //求出右节点的最大深度
        int rightMaxDepth = maxDepth(root.right);

      return Math.max(leftMaxDepth,rightMaxDepth)+1;
    }

    public static int maxDepth2(TreeNode root) {
        if (root == null){
            return 0;
        }
        int depth = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            depth++;
            for (int i=0;i<size;i++){
                TreeNode treeNode = queue.poll();
                if (treeNode.left!=null){
                    queue.add(treeNode.left);
                }
                if (treeNode.right!=null){
                    queue.add(treeNode.right);
                }
            }
        }
        return depth;
    }



    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(130);

        TreeNode t2 = new TreeNode(110);
        t1.left = t2;
        TreeNode t3 = new TreeNode(140);
        t1.right = t3;
        TreeNode t4 = new TreeNode(100);
        t2.left = t4;
        TreeNode t5 = new TreeNode(120);
        t2.right = t5;
        TreeNode t6 = new TreeNode(150);
        t3.left = t6;
        TreeNode t7 = new TreeNode(160);
        t3.right = t7;

        System.out.println(maxDepth(t1));
        System.out.println(maxDepth2(t1));

        System.out.println(t1.pre());
        System.out.println(t1.middle());
        System.out.println(t1.post());
    }
}
