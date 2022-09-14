class Solution {
    public int searchInsert(int[] nums, int target) {
        int count=0;
        for(int num : nums) {
            if(target <= num) return count;
            count++;
        }
        return count;
    }
}