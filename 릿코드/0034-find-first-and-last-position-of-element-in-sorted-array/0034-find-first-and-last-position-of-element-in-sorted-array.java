class Solution {
    public int[] searchRange(int[] nums, int target) {        
        int indexOne = -1, indexTwo = -1;
        for(int i=0, len=nums.length; i<len; i++) {
            if(nums[i] == target && indexOne == -1) indexOne = i;
            if(nums[len-i-1] == target && indexTwo == -1) indexTwo = len-i-1;
            if(indexOne != -1 && indexTwo != -1) break;
        }

        return new int[]{indexOne, indexTwo};
    }
}