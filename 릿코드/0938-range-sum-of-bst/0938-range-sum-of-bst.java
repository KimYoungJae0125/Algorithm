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
    public int rangeSumBST(TreeNode root, int low, int high) {
        int[] result = new int[1];
        BST(root, result, low, high);
        return result[0];
    }
    private void BST(TreeNode node, int[] result, int low, int high) {
        if(low <= node.val && node.val <= high) result[0] += node.val;
        if(node.left != null) {
            BST(node.left, result, low, high);
        }
        if(node.right != null) {
            BST(node.right, result, low, high);
        }
    }
}