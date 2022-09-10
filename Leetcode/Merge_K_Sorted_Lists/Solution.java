package Leetcode.Merge_K_Sorted_Lists;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Solution {
      public static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
    public static void main(String[] args) {
        new Solution().mergeKLists(new ListNode[]{new ListNode(1, new ListNode(4, new ListNode(5)))
                                                , new ListNode(1, new ListNode(3, new ListNode(4)))
                                                , new ListNode(2, new ListNode(6))});
    }
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
