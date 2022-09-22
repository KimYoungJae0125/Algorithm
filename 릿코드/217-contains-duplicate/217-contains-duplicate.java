class Solution {
    public boolean containsDuplicate(int[] nums) {
        return new HashSet<>(){{
            for(int num : nums) {
                if(contains(num)) break;
                add(num);
            }}}.size() != nums.length;
    }
}