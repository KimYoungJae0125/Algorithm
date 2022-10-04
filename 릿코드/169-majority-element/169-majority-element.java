class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int result = -1;
        int max = -1;
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0)+1);
            if(map.get(num) > max) {
                max = map.get(num);
                result = num;
            }
        }
        return result;
    }
}