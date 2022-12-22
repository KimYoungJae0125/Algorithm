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
    public ListNode reverseKGroup(ListNode head, int k) {
        List<List<Integer>> list1 = new ArrayList<>();
        while(true) {
            List<Integer> newList = new ArrayList<>();
            for(int i=0; i<k; i++) {
                if(head == null) break;
                newList.add(head.val);
                head = head.next;
            }
            list1.add(newList);
            if(head == null) break;
        }

        ListNode result = new ListNode();
        ListNode createResult = result;
        for(var i : list1.stream()
                .map(list -> {
                        if(list.size() == k) Collections.reverse(list);
                        return list;
                    })
                .flatMap(list -> list.stream())
                .toList()) {
            createResult.next = new ListNode(i);
            createResult = createResult.next;
        }

        return result.next;
    }
}