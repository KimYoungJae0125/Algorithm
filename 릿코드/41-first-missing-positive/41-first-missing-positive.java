class Solution {
    public int firstMissingPositive(int[] nums) {
        int count = 1;
        Arrays.sort(nums);
        while(true) {
            if(Arrays.binarySearch(nums, count) < 0) return count;
            count++;
        }
    }
}