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
        List<Integer> list1 = new ArrayList<>();
        while(l1 != null) {
            list1.add(l1.val);
            l1 = l1.next;
        }
        List<Integer> list2 = new ArrayList<>();
        while(l2 != null) {
            list2.add(l2.val);
            l2 = l2.next;
        }
        int len = list1.size() > list2.size() ? list1.size() : list2.size();
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        for(int i=0; i<len; i++) {
            int a = list1.size() > i? Integer.parseInt(String.valueOf(list1.get(i))) : 0;
            int b = list2.size() > i? Integer.parseInt(String.valueOf(list2.get(i))) : 0;
            int abSum = a+b+sum;
            if(abSum >= 10) {
                sum = 1;
                abSum = abSum%10;
            } else {
                sum = 0;
            }
            list.add(abSum);
            if(sum == 1 && (len-1) == i) list.add(1);
        }

        ListNode newList = null;
        for(int i=1, listLen=list.size(); i<=listLen; i++) {
            if(newList == null) {
                newList = new ListNode(list.get(listLen-i));
            } else {
                newList = new ListNode(list.get(listLen-i), newList);
            }
        }
        return newList;
    }
}