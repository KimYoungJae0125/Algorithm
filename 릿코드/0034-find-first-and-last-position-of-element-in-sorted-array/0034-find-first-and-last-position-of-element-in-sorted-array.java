class Solution {
    public int[] searchRange(int[] nums, int target) {
        List<Integer> list = new ArrayList<>(){{ for(int num : nums) add(num);}};
        return new int[]{list.indexOf(target), list.lastIndexOf(target)};
    }
}