class Solution {
    public int singleNonDuplicate(int[] nums) {
        var map = new HashMap<Integer, Integer>();
        var set = new HashSet<Integer>();
        for(var num : nums) {
            map.put(num, (map.getOrDefault(num, 0)+1));
            set.add(num);
            if(map.get(num) == 2) set.remove(num);
        }
        return set.iterator().next();
    }
}