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
    public ListNode swapPairs(ListNode head) {
        var newNode = new ListNode();
        var curNode = newNode;
        int count = 0;
        while(head != null) {
            if(count % 2 == 0 && head.next != null) {
                int swap = head.next.val;
                head.next.val = head.val;
                head.val = swap;
            }
            curNode.next = head;
            curNode = curNode.next;
            head = head.next;
            count++;
        }
        return newNode.next;
    }
}