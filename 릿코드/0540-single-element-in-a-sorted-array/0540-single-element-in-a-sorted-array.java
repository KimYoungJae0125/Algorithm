class Solution {
    public int singleNonDuplicate(int[] nums) {
        int index = 0, length = nums.length - 1;
        for(; index < length; index++) {
            if(nums[index] == nums[index + 1]) {
                index++;
                continue;
            }
            break;
        }
        return nums[index];
    }
}