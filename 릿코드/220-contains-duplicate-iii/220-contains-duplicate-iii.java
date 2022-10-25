class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        for(int i=0, len=nums.length; i<len; i++) {
            for(int j=i+1; j<len; j++) {
                if(j-i > indexDiff ) break;
                if(Math.abs(nums[i] - nums[j]) <= valueDiff) return true;
            }
        }
        return false;
    }
}