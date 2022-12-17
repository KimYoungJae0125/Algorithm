class Solution {
    public int singleNonDuplicate(int[] nums) {
        var set = new HashSet<Integer>();
        for(var num : nums) {
            boolean flag = false;
            if(!set.contains(num)) {
                set.add(num);
                flag = true;
            }
            if(!flag) set.remove(num);
        }
        return set.iterator().next();
    }
}