class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        var map = new HashMap<Integer, Integer>();
        for(int i=0, len=nums.length; i<len; i++) {
           if(map.get(nums[i]) != null && Math.abs(map.get(nums[i]) - i) <= k) return true;
            map.put(nums[i], i);
        }
        return false;
    }
}