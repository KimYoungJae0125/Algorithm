class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            Integer prevIndex = map.getOrDefault(target - nums[i], null);
            if(mapNum != null) {
                return new int[]{prevIndex, i};
            }
            map.put(nums[i], i);
        }
        return new int[]{0, 0};
    }
}