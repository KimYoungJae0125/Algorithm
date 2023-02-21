class Solution {
    public int singleNonDuplicate(int[] nums) {
        Map<Integer, Boolean> map = new HashMap<>();
        for(int num : nums) {
            Boolean single = map.get(num);
            if(single == null) {
                map.put(num, true);
            } else {
                map.put(num, false);
            }
        }
        Iterator<Integer> iter = map.keySet().iterator();
        while(iter.hasNext()) {
            int result = 0;
            if(map.get((result = iter.next()))) return result;
        }
        return 0;
    }
}