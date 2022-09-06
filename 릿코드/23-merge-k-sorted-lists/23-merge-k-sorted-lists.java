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
          ListNode node = new ListNode();
          ListNode cur = node;
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
              cur.next = lists[breakInt];
              cur = cur.next;
              lists[breakInt] = lists[breakInt].next;
          }
          return node.next;
    }
}