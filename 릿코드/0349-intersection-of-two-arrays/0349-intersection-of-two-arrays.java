class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        return Arrays.stream(nums1).distinct().filter(n -> {
            for(int num : nums2) {
                if(n == num) return true;
            }
            return false;
        }).toArray();
    }
}