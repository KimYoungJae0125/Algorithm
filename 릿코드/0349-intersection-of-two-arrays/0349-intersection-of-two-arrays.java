class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>(){{for(int num : nums1) add(num);}};
        Set<Integer> set2 = new HashSet<>(){{for(int num : nums2) add(num);}};

        return set.stream().filter(s -> {
            for(int num : set2) {
                if(s.intValue() == num) return true;
            }
            return false;
        }).mapToInt(s -> s).toArray();
    }
}