class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            //테스트
            Integer prevIndex;
            if((prevIndex = map.getOrDefault(target - nums[i], null)) != null) {
                return new int[]{prevIndex, i};
            }
            map.put(nums[i], i);
        }
        return new int[]{0, 0};
    }
}