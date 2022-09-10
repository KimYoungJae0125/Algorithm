package Leetcode.Keyboard_Row;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Arrays.stream(new Solution().findWords(new String[]{"Hello", "Alaska", "Dad", "peace"})).map(s -> s + ", ").forEach(System.out::print);
        System.out.println();
        Arrays.stream(new Solution().findWords(new String[]{"omk"})).map(s -> s + ", ").forEach(System.out::print);
        System.out.println();
        Arrays.stream(new Solution().findWords(new String[]{"adsdf", "sfd"})).map(s -> s + ", ").forEach(System.out::print);
        System.out.println();
        Arrays.stream(new Solution().findWords(new String[]{"asdfghjkl","qwertyuiop","zxcvbnm"})).map(s -> s + ", ").forEach(System.out::print);
        System.out.println();
        Arrays.stream(new Solution().findWords(new String[]{"abdfs","cccd","a","qwwewm"})).map(s -> s + ", ").forEach(System.out::print);

    }
    public String[] findWords(String[] words) {
        String firstS = "qwertyuiop";
        String secondS = "asdfghjkl";
        String thirdS = "zxcvbnm";
        return Arrays.stream(words).filter(s -> {
            String[] c = s.toLowerCase().split("");
            int count = 0;
            for(int i =0, len = c.length; i<len; i++) {
                if(count == -1) break;
                if(firstS.contains(c[i])) {
                    if(count == 2 || count == 3) {
                        count = -1; break;
                    }
                    count = 1;
                }
                if(secondS.contains(c[i])) {
                    if(count == 1 || count == 3) {
                        count = -1; break;
                    }
                    count = 2;
                }
                if(thirdS.contains(c[i])) {
                    if(count == 1 || count == 2) {
                        count = -1; break;
                    }
                    count = 3;
                }
            }
            return count != -1;
        }).toArray(String[]::new);
    }
}
