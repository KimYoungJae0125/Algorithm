class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        return new ArrayList<>(){{
            int len = nums.length;
            Set<Integer> set = new HashSet<>(){{for(int num: nums) add(num);}};
            for(int i=1; i<=len; i++) {
                if(!set.contains(i)) add(i);
            }
        }};
    }
}