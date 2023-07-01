class Solution {
    public int searchInsert(int[] nums, int target) {
        int index = 0;
        for(int i = 0, halfLength = nums.length/2 + 1; i < halfLength; i++) {
            if(target <= nums[i]) {
                index = i;
                break;
            }
            if(nums[nums.length - i - 1] < target) {
                index = nums.length - i;
                break;
            }
            if(i == halfLength -1) index = nums.length;
        }
        return index;
    }
}