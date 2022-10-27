class Solution {
    public void moveZeroes(int[] nums) {
        for(int i=0, len=nums.length-1; i<len; i++) {
            if(nums[i] == 0) {
                int count = 0;
                while(i+count < len) {
                    count++;
                    if(nums[i+count] != 0) break;
                }
                nums[i] = nums[i+count];
                nums[i+count] = 0;
            }
        }
    }
}