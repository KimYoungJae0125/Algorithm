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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        List<Integer> list = new ArrayList<>();
        while(head != null) {
            list.add(head.val);
            head = head.next;
        }
        ListNode resultNode = new ListNode();
        ListNode curNode = resultNode;
        for(int i=0, len = list.size(); i<len; i++) {
            if(len-i != n) {
                curNode.next = new ListNode(list.get(0));
                curNode = curNode.next;
            }
            list.remove(0);
        }

        return resultNode.next;
    }
}