class Solution {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        int[] newNums = nums;
        int count = 0;
        for(int num : nums) if(num != 0) newNums[count++] = num;
        for(int i=count; i<len; i++) newNums[i] = 0;
    }
}