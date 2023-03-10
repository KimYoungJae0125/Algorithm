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

    int[] headVals;
    int size;

    public Solution(ListNode head) {
        List<int[]> list = new ArrayList<>();
        while(head != null) {
            list.add(new int[]{head.val});
            head = head.next;
        }
        headVals = list.stream().mapToInt(i -> i[0]).toArray();
        size = list.size();
    }

    public int getRandom() {
        return headVals[(int) (Math.random() * size)];
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */