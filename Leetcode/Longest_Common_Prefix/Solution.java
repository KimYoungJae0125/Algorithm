package Leetcode.Longest_Common_Prefix;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        System.out.println(new Solution().longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
        System.out.println(new Solution().longestCommonPrefix(new String[]{"ab", "a"}));
    }
    public String longestCommonPrefix(String[] strs) {
        String[] a = Arrays.stream(strs).sorted().toArray(String[]::new);
//        IntStream.range(0, strs.length-1).filter(i -> )
//        Arrays.stream(a).limit(strs.length-1).filter(s -> {
//            for(int i=0, len=strs[0].length(); i<len; i++) {
//            }
//        })
        for(int i=0, len=strs[0].length(); i<len; i++) {
            for(int j=0, lenJ= strs.length; j<lenJ; j++) {
                if(j < lenJ-1){
                    if(strs[j].charAt(i) != strs[j+1].charAt(i)) {
                        return strs[0].substring(0, i);
                    }
                }
            }
        }
        return strs[0];
    }
}
