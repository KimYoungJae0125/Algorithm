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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newListNode = new ListNode();
        ListNode cur = newListNode;
        ListNode[] listNode = new ListNode[]{list1, list2};
        while(true) {
            int max = 999_999_999, index = -1;
            for(int i=0, len=listNode.length; i<len; i++) {
                if(listNode[i] == null) continue;
                if(listNode[i].val < max) {
                    max = listNode[i].val;
                    index = i;
                }
            }
            if(index == -1) break;
            cur.next = listNode[index];
            cur = cur.next;
            listNode[index] = listNode[index].next;
        }
        return newListNode.next;
    }
}