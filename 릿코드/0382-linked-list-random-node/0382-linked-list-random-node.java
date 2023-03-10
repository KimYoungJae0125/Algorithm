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
    int size = 0;

    public Solution(ListNode head) {
        int[] temp = new int[10000];
        while(head != null) {
            temp[size++] = head.val;
            head = head.next;
        }
        headVals = new int[size];
        for(int i = 0; i < size; i++) headVals[i] = temp[i];
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