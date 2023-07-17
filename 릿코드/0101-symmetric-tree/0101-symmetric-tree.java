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
    public boolean isSymmetric(TreeNode root) {
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        ldfs(root.left, left);
        rdfs(root.right, right);
        
        return left.equals(right);
    }
    private void ldfs(TreeNode node, List<Integer> list) {
        if(node != null) {
            ldfs(node.right, list);
            ldfs(node.left, list);    
            list.add(node.val);
        } else {
            list.add(null);
        }
    }
    
    private void rdfs(TreeNode node, List<Integer> list) {
        if(node != null) {
            rdfs(node.left, list);
            rdfs(node.right, list);
            list.add(node.val);
        } else {
            list.add(null);
        }
    }
}