class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<>(){{for(int num : nums) add(num);}};
        if(set.size() < 3) return set.stream().mapToInt(i -> i).max().getAsInt();
        return set.stream().sorted(Comparator.reverseOrder()).limit(3).toList().get(2);
    }
}