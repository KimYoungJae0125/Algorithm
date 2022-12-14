class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0, len=nums.length; i<len; i++) {
            for(int j=0; j<len; j++) {
                if(i == j) continue;
                if(nums[i] + nums[j] == target) return new int[]{i, j};
            }
        }
        return null;
    }
}