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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return null;
        Stack<Integer> stack = new Stack<>();
        while(head != null) {
            stack.push(head.val);
            head = head.next;
        }
        for(int i=0, len=k%stack.size(); i<len; i++) {
            stack.add(0, stack.pop());
        }
        ListNode newNode = new ListNode(stack.pop());
        while(!stack.isEmpty()) {
            newNode = new ListNode(stack.pop(), newNode);
        }
        return newNode;
    }
}