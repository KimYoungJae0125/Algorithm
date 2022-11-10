class Solution {
    public int triangularSum(int[] nums) {
        if(nums.length == 1) return nums[0];
        int count = nums.length;
        while(true) {
            if(count <= 2) return (nums[0] + nums[1])%10;
            for(int i=0; i<count-1; i++) nums[i] = (nums[i]+nums[i+1])%10;
            count--;
        }
    }
}