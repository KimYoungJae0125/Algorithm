class Solution {
    public boolean containsDuplicate(int[] nums) {
        return new HashSet<Integer>(){{for(int num : nums) {if(contains(num)) break; add(num);}}}.size() != nums.length;
    }
}