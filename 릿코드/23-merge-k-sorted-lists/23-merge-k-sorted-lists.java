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
    public ListNode mergeKLists(ListNode[] lists) {
          ListNode node = null;
          while(true) {
              int max = 999999999, breakInt = -1;
              for(int i=0, len= lists.length; i<len; i++) {
                  if(lists[i] == null) continue;
                  if(lists[i].val < max) {
                      max = lists[i].val;
                      breakInt = i;
                  }
              }
              if(breakInt == -1) break;
              if(node == null) {
                  node = new ListNode(max);
              } else {
                  node = new ListNode(max, node);
              }
              lists[breakInt] = lists[breakInt].next;
          }
          ListNode resultNode = null;
          while(node != null) {
              if(resultNode == null) {
                  resultNode = new ListNode(node.val);
              } else {
                  resultNode = new ListNode(node.val, resultNode);
              }
              node = node.next;
          }

          return resultNode;
    }
}