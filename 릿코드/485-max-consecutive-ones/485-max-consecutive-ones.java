class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, secondCount = 0;
        for(int num : nums) {
            if(num != 0) {
                secondCount++;
            } else {
                if (secondCount > count) count = secondCount;
                secondCount = 0;
            }
        }
        if(secondCount > count) count = secondCount;
        return count;
    }
}