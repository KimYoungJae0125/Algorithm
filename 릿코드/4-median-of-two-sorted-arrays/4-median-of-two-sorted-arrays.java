class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] list = Stream.of(nums1, nums2).flatMapToInt(Arrays::stream).sorted().toArray();
        int listLen = list.length, index = listLen/2;
        double result = list[index];
        if(listLen%2 ==0) result = (double)(list[index-1] + list[index])/2;
        return result;
    }
}