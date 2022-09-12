class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums) {
            if(i%2 ==0)  map.put(i, map.get(i) == null ? 0 : map.get(i) + 1);
        }
        if(map.size() == 0) return -1;
        List<Integer> list = new ArrayList<>();
        int max = -1;
        for(Integer key : map.keySet()) {
            if(map.get(key) > max) {
                max = map.get(key);
            }
        }
        int returnMin = 999_999_999;
        for(Integer key : map.keySet()) {
           if(map.get(key) == max) if(returnMin > key) returnMin = key;
        }
        return returnMin;
    }
}