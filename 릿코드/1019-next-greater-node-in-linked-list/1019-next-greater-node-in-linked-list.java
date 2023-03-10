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
         Stack<int[]> indexStacks = new Stack<>();
         List<int[]> headVals = new ArrayList<>();
         int index = 0;
         while(head != null) {
             headVals.add(new int[]{head.val});
             while(!indexStacks.isEmpty() && headVals.get(indexStacks.peek()[0])[0] < head.val) {
                 headVals.set(indexStacks.pop()[0], new int[]{head.val});
             }
             indexStacks.add(new int[]{index++});
             if(head.next == null) break;
             head = head.next;
         }

         while(!indexStacks.isEmpty()) headVals.set(indexStacks.pop()[0], new int[]{0});

         int length = headVals.size();
         int[] result = new int[length];
         for(int i = 0; i < length; i++) {
             result[i] = headVals.get(i)[0];
         }

         return result;
    }
}