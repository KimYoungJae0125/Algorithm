package Leetcode.Two_Sum;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.stream(new Solution().twoSum(new int[]{2,7,11,15}, 9)).mapToObj(String::valueOf).collect(Collectors.joining(", ")));
        System.out.println(Arrays.stream(new Solution().twoSum(new int[]{3, 2, 4}, 6)).mapToObj(String::valueOf).collect(Collectors.joining(", ")));
        System.out.println(Arrays.stream(new Solution().twoSum(new int[]{3, 3}, 6)).mapToObj(String::valueOf).collect(Collectors.joining(", ")));

    }
    public int[] twoSum(int[] nums, int target) {
        int[] index = new int[2];
        for(int i=0, len=nums.length; i<len; i++) {
            for(int j=i+1; j<len; j++) {
                if(nums[i] + nums[j] == target) {
                    index[0] = i;
                    index[1] = j;
                    return index;
                }
            }
        }
        return index;
    }
}
