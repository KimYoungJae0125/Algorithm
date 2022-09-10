package Leetcode.Roman_To_Integer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().romanToInt("III"));
        System.out.println(new Solution().romanToInt("LVIII"));
        System.out.println(new Solution().romanToInt("MCMXCIV"));
    }
    public int romanToInt(String s) {
        char[] c = s.toCharArray();
        int sum = 0;
        for(int i=0; i<c.length; i++) {
            int result = charToInt(c[i]);
            if (i < c.length - 1) {
                boolean flag = c[i] == 'I' && (c[i + 1] == 'V' || c[i + 1] == 'X')
                            || c[i] == 'X' && (c[i + 1] == 'L' || c[i + 1] == 'C')
                            || c[i] == 'C' && (c[i + 1] == 'D' || c[i + 1] == 'M');
                if(flag) {
                    result = charToInt(c[i + 1]) - result;
                    i++;
                }
            }
            sum += result;
        }
        return sum;
    }
    int charToInt(char c) {
        int result = 0;
        switch (c) {
            case 'I' :
                result = 1;
                break;
            case 'V' :
                result = 5;
                break;
            case 'X' :
                result = 10;
                break;
            case 'L' :
                result = 50;
                break;
            case 'C' :
                result = 100;
                break;
            case 'D' :
                result = 500;
                break;
            case 'M' :
                result = 1000;
                break;
        }
        return result;
    }
}
