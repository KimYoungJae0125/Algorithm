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
        List<Integer> list = new ArrayList<>();
        BST(root, list, low, high);
        int result = 0;
        for(int val : list) {
            result += val;
        }
        return result;
    }
    private void BST(TreeNode node, List<Integer> list, int low, int high) {
        if(low <= node.val && node.val <= high) list.add(node.val);
        if(node.left != null) {
            BST(node.left, list, low, high);
        }
        if(node.right != null) {
            BST(node.right, list, low, high);
        }
    }
}