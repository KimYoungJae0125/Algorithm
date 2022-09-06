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
        List<Integer> list = new ArrayList<>();
        for(ListNode n : lists) {
          while(n != null) {
              list.add(n.val);
              n = n.next;
          }
        }
        Integer[] a = list.stream().sorted(Comparator.reverseOrder()).toArray(Integer[]::new);
        ListNode node = null;
        for(int i : a) {
            if(node == null) {
                node = new ListNode(i);
            } else {
                node = new ListNode(i, node);
            }
        }

        return node;
    }
}