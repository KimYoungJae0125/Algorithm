class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums) set.add(num);
        int count = 1;
        while(true) {
            if(!set.contains(count)) return count;
            count++;
        }
    }
}