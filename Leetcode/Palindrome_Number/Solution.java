package Leetcode.Palindrome_Number;

import java.util.Queue;

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().isPalindrome(-123));
    }
    public boolean isPalindrome(int x) {
        return String.valueOf(x).equals(new StringBuilder().append(x).reverse().toString());
    }
//    public boolean isPalindrome(int x) {
//        StringBuilder sb = new StringBuilder();
//        sb.append(x).reverse();
//        return String.valueOf(x).equals(sb.toString());
//    }

}
