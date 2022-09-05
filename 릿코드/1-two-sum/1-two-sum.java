class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] index = new int[2];
        for(int i=0, len=nums.length; i<len; i++) {
            for(int j=i+1; j<len; j++) {
                if(nums[i] + nums[j] == target) {
                    index[0] = i;
                    index[1] = j;
                    return index;
                }
            }
        }
        return index;
    }
}