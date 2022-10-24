package Leetcode.hard.Regular_Expression_Matching;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        //.은 모든 문자열로 매치 가능
        //*의 앞에 있는 문자가 0개 이상인거를 의미
        System.out.println(new Solution().isMatch("aa", "a"));          //false
        System.out.println(new Solution().isMatch("aa", "a*"));         //true
        System.out.println(new Solution().isMatch("ab", ".*"));         //true  .이 0개 이상인걸 의미 .은 모든 문자열로 매치 가능하므로 a,b가 됨
        System.out.println(new Solution().isMatch("aab", "c*a*b"));     //true  c가 0개 이상, a가 0개 이상, b는 1개
        System.out.println(new Solution().isMatch("mississippi", "mis*is*p*."));     //false
        System.out.println(new Solution().isMatch("mississippi", "mis*is*ip*."));     //true
        System.out.println(new Solution().isMatch("abcd", "d*"));     //false
        System.out.println(new Solution().isMatch("ab", ".*c"));     //false
        System.out.println(new Solution().isMatch("aaba", "ab*a*c*a"));     //false
    }
    public boolean isMatch(String s, String p) {
        int sLen = s.length();
        int pLen = p.length();

        boolean[][] dp = new boolean[sLen + 1][pLen + 1];
        dp[0][0] = true;
        for (int j = 2; j <= pLen; j++) {
            if (p.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 2];
            }
        }
        for (int i = 1; i <= sLen; i++) {
            for (int j = 1; j <= pLen; j++) {
                char sChar = s.charAt(i - 1);
                char pChar = p.charAt(j - 1);
                if (sChar == pChar || pChar == '.') {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (pChar == '*') {
                    // skip matching
                    dp[i][j] = dp[i][j - 2];

                    // matching
                    char pPrevChar = p.charAt(j - 2);
                    if (pPrevChar == sChar || pPrevChar == '.') {
                        dp[i][j] |= dp[i - 1][j];
                    }
                }
            }
        }
        return dp[sLen][pLen];
    }
//    private boolean isMatch(String s, String p, int sIndex, int pIndex, boolean result) {
//        if(p.length() < sIndex) {
//            if(p.charAt())
//            if(s.charAt(sIndex) == p.charAt(pIndex)) {
//
//            }
//        } else {
//            return result;
//        }
//    }
}
