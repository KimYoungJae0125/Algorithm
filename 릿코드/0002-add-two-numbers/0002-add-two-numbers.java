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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode result = new ListNode();
       ListNode cur = result;
       int digits = 0;
       while(l1 != null || l2 != null) {
           int sum = 0;
           if(l1 != null) {
               sum += l1.val;
               l1 = l1.next;
           }
           if(l2 != null) {
               sum += l2.val;
               l2 = l2.next;
           }
           if(digits >= 1) {
               sum += digits;
               digits = 0;
           }
           if(sum >= 10) {
               digits = sum/10;
               sum %= 10;
           }
           cur.next = new ListNode(sum);
           cur = cur.next;
       }
       if(digits >= 1) {
           cur.next = new ListNode(digits);
       }

       return result.next;
    }
}