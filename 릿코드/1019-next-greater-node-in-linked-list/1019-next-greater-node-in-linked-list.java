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
class Solution {
    public int[] nextLargerNodes(ListNode head) {
         Stack<Integer> indexStacks = new Stack<>();
         List<Integer> headVals = new ArrayList<>();
         int index = 0;
         while(head != null) {
             headVals.add(head.val);
             while(!indexStacks.isEmpty() && headVals.get(indexStacks.peek()) < head.val) {
                 headVals.set(indexStacks.pop(), head.val);
             }
             indexStacks.add(index++);
             if(head.next == null) break;
             head = head.next;
         }

         while(!indexStacks.isEmpty()) headVals.set(indexStacks.pop(), 0);

         int length = headVals.size();
         int[] result = new int[length];
         for(int i = 0; i < length; i++) {
             result[i] = headVals.get(i);
         }

         return result;
    }
}