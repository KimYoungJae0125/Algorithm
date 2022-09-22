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
   public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root != null) {
            Stack<TreeNode> stack = new Stack<>();
            Stack<Integer> n = new Stack<>();
            stack.add(root);
            n.add(root.val);
            while(!stack.isEmpty()) {
                TreeNode cur = stack.pop();
                int sum = n.pop();
                if(cur.left == null && cur.right == null) {
                    if(sum == targetSum) return true;
                }
                if(cur.left != null) {
                    stack.push(cur.left);
                    n.push(cur.left.val + sum);
                }
                if(cur.right != null) {
                    stack.push(cur.right);
                    n.push(cur.right.val + sum);
                }
            }
        }
        return false;
    }
}