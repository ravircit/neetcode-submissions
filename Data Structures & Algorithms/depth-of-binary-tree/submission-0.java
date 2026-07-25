/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
       public int maxDepth(TreeNode root) {
           if(root==null)return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level, count = 0;
        boolean flag = false;
        TreeNode temp;
        while (!queue.isEmpty()) {
            count++;
            level = queue.size();
            while (level-- > 0) {
                temp = queue.poll();
                if (temp.left != null)
                    queue.add(temp.left);
                if (temp.right != null)
                    queue.add(temp.right);
            }
        }
        return count;
    }
}

