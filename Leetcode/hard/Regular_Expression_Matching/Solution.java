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
        if(s.length() != p.length() && p.indexOf('*') == -1) return false;
        var pMap = new HashMap<Character, Integer>(){{
            for(int i=0, len=p.length(); i<len; i++) {
                char c = p.charAt(i);
                if(c == '*') {
                    put(p.charAt(i-1), -1);
                    continue;
                }
                if(get(c) == null || get(c) != -1) {
                    put(c, getOrDefault(c, 0) + 1);
                }
            }
        }};

        var sMap = new HashMap<Character, Integer>(){{
            for(var c : s.toCharArray()) {
                put(c, getOrDefault(c, 0) + 1);
            }
        }};

        for(var c : sMap.keySet()) {
            if(pMap.get(c) == null && pMap.get('.') != null) continue;
            if(pMap.get(c) != null) {
                if(pMap.get(c) == -1) continue;
                if(pMap.get(c) == sMap.get(c)) continue;
                if(pMap.get('.') != null) {
                    if(sMap.get(c) == pMap.get(c) + pMap.get('.')) continue;
                }
            }
            return false;
        }

        for(var c : pMap.keySet()) {
            if((c == '.' && sMap.get(c) == null) || pMap.get(c) == -1) continue;
            if(sMap.get(c) != null) {
                if(sMap.get(c) == pMap.get(c)) continue;
                if(pMap.get('.') != null && (sMap.get(c) == pMap.get('.') + pMap.get(c))) continue;
            }
            return false;
        }

        return true;
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
