package Leetcode.First_Unique_Character_in_a_String;

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().firstUniqChar("leetcode"));
        System.out.println(new Solution().firstUniqChar("loveleetcode"));
        System.out.println(new Solution().firstUniqChar("aabb"));
    }
    public int firstUniqChar(String s) {
        char[] c = s.toCharArray();
        for(int i=0, len=c.length; i<len; i++) {
            if(s.indexOf(c[i]) - s.lastIndexOf(c[i]) == 0) {
                return i;
            }
        }
        return -1;
    }
}
