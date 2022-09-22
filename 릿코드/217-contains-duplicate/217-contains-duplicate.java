class Solution {
    public boolean containsDuplicate(int[] nums) {
        return new HashSet<Integer>(){{for(int num : nums) add(num);}}.size() != nums.length;
    }
}