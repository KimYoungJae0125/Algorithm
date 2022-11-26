class Solution {
    public void sortColors(int[] nums) {
        for(int i=0, len=nums.length; i<len; i++) {
            for(int j=0; j<len; j++) {
                if(nums[i] <= nums[j]) {
                    int newNum = nums[j];
                    nums[j] = nums[i];
                    nums[i] = newNum;
                }
            }
        }
    }
}