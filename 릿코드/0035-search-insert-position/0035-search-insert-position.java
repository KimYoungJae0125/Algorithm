class Solution {
    public int searchInsert(int[] nums, int target) {
        int index = 0;
        for(; index < nums.length; index++) if(target <= nums[index]) break;
        return index;
    }
}