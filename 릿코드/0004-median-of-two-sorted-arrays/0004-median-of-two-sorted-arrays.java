class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int nums1Length = nums1.length, length = nums1Length + nums2.length;
        int[] nums = new int[length];
        for(int i=0; i<length; i++) 
            if(i < nums1Length) nums[i] = nums1[i];
            else nums[i] = nums2[i - nums1Length];
        
        Arrays.sort(nums);
        
        if(length % 2 == 0) return (nums[length/2-1] + nums[length/2]) / 2.0;
        return nums[length/2];
    }
}