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
    public int deepestLeavesSum(TreeNode root) {
        Queue<int[]> queue = new PriorityQueue<>((a,b) -> b[1] - a[1]);
        preOrder(root, queue, 0);

        int depth = queue.peek()[1];
        int result = 0;
        while(!queue.isEmpty() && queue.peek()[1] == depth) {
            result += queue.poll()[0];
        }

        return result;
    }

    public void preOrder(TreeNode node, Queue<int[]> queue, int depth) {
        queue.offer(new int[]{node.val, depth});
        depth++;
        if(node.left != null) preOrder(node.left, queue, depth);
        if(node.right != null) preOrder(node.right, queue, depth);
    }
}