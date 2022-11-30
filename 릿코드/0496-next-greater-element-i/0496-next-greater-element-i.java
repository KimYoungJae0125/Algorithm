class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       int nums1Length = nums1.length;
        int[] result = new int[nums1Length];
        for(int i=0; i<nums1Length; i++) {
            result[i] = -1;
            boolean isEqual = false;
            for(int j=0, len=nums2.length; j<len; j++) {
                if(nums1[i] == nums2[j]) isEqual = true;
                if(isEqual && nums2[j] > nums1[i]) {
                    result[i] = nums2[j];
                    break;
                }
            }
        }
        return result; 
    }
}