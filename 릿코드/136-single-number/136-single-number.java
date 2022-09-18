class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num, map.get(num) != null ? map.get(num) + 1 : 0);
        }
        int key = 0, min = 999_999_999;
        for(int k : map.keySet()) {
            if(map.get(k) < min) {
                key = k;
                min = map.get(k);
            }
        }
        return key;
    }
}