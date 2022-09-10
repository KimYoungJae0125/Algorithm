package Leetcode.Median_Of_Two_Sorted_Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));
        System.out.println(new Solution().findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}));
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] list = Stream.of(nums1, nums2).flatMapToInt(Arrays::stream).sorted().toArray();
        int listLen = list.length, index = listLen/2;
        double result = list[index];
        if(listLen%2 ==0) result = (double)(list[index-1] + list[index])/2;
        return result;
    }
}
