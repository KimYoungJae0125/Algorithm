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
         int[] headVals = new int[10000];
         boolean[] check = new boolean[10000];
         Queue<int[][]> queue = new PriorityQueue<>(((a,b) -> b[0][0] - a[0][0]));
         int index = 0;
         while(head != null) {
             headVals[index++] = head.val;
             if(head.next == null) break;
             head = head.next;
             queue.offer(new int[][]{{head.val, index}});
             for(int i = 0; i < index; i++) {
                 if(!check[i] && headVals[i] < queue.peek()[0][0]) {
                     while(queue.peek()[0][1] < i) queue.poll();
                     if(queue.peek()[0][0] <= headVals[i]) break;
                     check[i] = true;
                     headVals[i] = queue.peek()[0][0];
                 }
             }
         }
         int[] result = new int[index];
         for(int i = 0; i < index; i++) {
             result[i] = check[i] ? headVals[i] : 0;
         }

         return result;
    }
}