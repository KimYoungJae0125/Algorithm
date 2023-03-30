/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        return bst(list, 0, list.size()-1);
    }

    private TreeNode bst(List<Integer> list, int index, int lastIndex) {
         if(index > lastIndex) return null;
         int mid = (index + lastIndex) / 2;
         TreeNode node = new TreeNode(list.get(mid));
         node.left = bst(list, index, mid-1);
         node.right = bst(list, mid+1, lastIndex);
         return node;
    }
}