class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        int result = -1;
        int max = -1;
        for(int key : map.keySet()) {
            if(map.get(key) > max) {
                result = key;
                max = map.get(key);
            }
        }
        return result;
    }
}