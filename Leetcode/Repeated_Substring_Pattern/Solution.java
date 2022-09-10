package Leetcode.Repeated_Substring_Pattern;

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().repeatedSubstringPattern("abab"));
        System.out.println(new Solution().repeatedSubstringPattern("aba"));
        System.out.println(new Solution().repeatedSubstringPattern("abcabcabcabcabcabcabc"));
        System.out.println(new Solution().repeatedSubstringPattern("a"));
        System.out.println(new Solution().repeatedSubstringPattern("abaababaab"));
        System.out.println(new Solution().repeatedSubstringPattern("ababba"));

    }
    public boolean repeatedSubstringPattern(String s) {
        for(int i=0, fullLen=s.length(), len=s.length()/2; i<len; i++) {
            if(fullLen%(i+1) !=0) continue;
            int cnt = 1;
            for(int j = i+1; j<fullLen-i; j+=(i+1)) {
                if(s.substring(0, i+1).equals(s.substring(j, j+i+1))) {
                    cnt++;
                } else {
                    break;
                }
            }
            if(cnt == fullLen/(i+1)) return true;
        }
        return false;
    }
}
