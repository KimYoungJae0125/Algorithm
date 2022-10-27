class Solution {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        int[] newNums = new int[len];
        int count = 0;
        for(int num : nums) if(num != 0) newNums[count++] = num;
        for(int i=0; i<len; i++) nums[i] = newNums[i];
    }
}