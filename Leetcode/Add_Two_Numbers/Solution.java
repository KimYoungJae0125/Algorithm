package Leetcode.Add_Two_Numbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
//        System.out.println(123);
//        System.out.println(String.valueOf(1_000_000_001));
//        int test = 1;
//        for(int i=1; i<32; i++) {
//            System.out.println(i + " : " + test);
//            test *= (i*2);
//        }
//        System.out.println("test : " + test);
//        System.out.println(String.valueOf(1_000_000_000_000_000_000_000_000_000_001));

        ListNode l1 = new Solution().new ListNode(2, new Solution().new ListNode(4, new Solution().new ListNode(3)));
        ListNode l2 = new Solution().new ListNode(5, new Solution().new ListNode(6, new Solution().new ListNode(4)));
        ListNode l3 = new Solution().new ListNode(9
                                                , new Solution().new ListNode(9
                                                    , new Solution().new ListNode(9
                                                    , new Solution().new ListNode(9
                                                    , new Solution().new ListNode(9
                                                    , new Solution().new ListNode(9
                                                    , new Solution().new ListNode(9
                                                        )))))));
        ListNode l4 = new Solution().new ListNode(9
                                                , new Solution().new ListNode(9
                                                    , new Solution().new ListNode(9
                                                    , new Solution().new ListNode(9
                                                        ))));
        ListNode l5 = new Solution().new ListNode(9
                                                        );
        ListNode l6 = new Solution().new ListNode(1
                                                , new Solution().new ListNode(9
                                                    , new Solution().new ListNode(9
                                                    , new Solution().new ListNode(9
                                                    , new Solution().new ListNode(9
                                                    , new Solution().new ListNode(9
                                                    , new Solution().new ListNode(9
                                                    , new Solution().new ListNode(9
                                                    , new Solution().new ListNode(9
                                                    , new Solution().new ListNode(9
        ))))))))));
        ListNode l7 = new Solution().new ListNode(2, new Solution().new ListNode(4, new Solution().new ListNode(9))
        );
        ListNode l8 = new Solution().new ListNode(5
                , new Solution().new ListNode(6
                , new Solution().new ListNode(4
                , new Solution().new ListNode(9
        ))));
//        ListNode newA = new Solution().addTwoNumbers(l1, l2);
//        ListNode newB = new Solution().addTwoNumbers(l3, l4);
        ListNode newB = new Solution().addTwoNumbers(l7, l8);
//        while(newA != null) {
//            System.out.print(", " + newA.val);
//            newA = newA.next;
//        }
        System.out.println();
        while(newB != null) {
            System.out.print(", " + newB.val);
            newB = newB.next;
        }
//        System.out.println(new Solution().addTwoNumbers(l5, l6));
    }
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
//        StringBuilder sb1 = new StringBuilder();
//        while(!stack1.isEmpty()) {
//            sb1.append(stack1.pop());
//        }
//        StringBuilder sb2 = new StringBuilder();
//        while(!stack2.isEmpty()) {
//            sb2.append(stack2.pop());
//        }
//        String str = String.valueOf(Double.parseDouble(sb1.toString()) + Double.parseDouble(sb2.toString()));
//        System.out.println("Str : " + str);
//        ListNode newList = new ListNode(Integer.parseInt(String.valueOf(str.charAt(0))));
//        for(int i=1; i<str.length(); i++) {
//            newList = new ListNode(Integer.parseInt(String.valueOf(str.charAt(i))), newList);
//            System.out.println(newList.val);
//        }

        return newList;
    }
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
