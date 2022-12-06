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
    public ListNode oddEvenList(ListNode head) {
        ListNode newNode = new ListNode();
        ListNode evenNode = newNode;
        List<Integer> list = new ArrayList<>();
        int count = 1;
        while(head != null) {
            if(count % 2 != 0) {
                evenNode.next = head;
                evenNode = evenNode.next;
            } else {
                list.add(head.val);
            }
            count++;
            head = head.next;
        }

        while(!list.isEmpty()) {
            evenNode.next = new ListNode(list.remove(0));
            evenNode = evenNode.next;
        }

        return newNode.next;
    }
}