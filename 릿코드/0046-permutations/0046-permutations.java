class Solution {
    public List<List<Integer>> permute(int[] nums) {
        int numsLength = nums.length;
        int[] result = new int[numsLength];
        boolean[] isVisit = new boolean[numsLength];
        Set<List<Integer>> list = new HashSet<>();
        dp(nums, result, isVisit, 0, numsLength, list);
        return list.stream().toList();
    }

    private void dp(int[] nums, int[] result, boolean[] isVisit, int index, int numsLength, Set<List<Integer>> list) {
        for(int i=0; i<numsLength; i++) {
            if(!isVisit[i]) {
                isVisit[i] = true;
                result[index] = nums[i];
                dp(nums, result, isVisit, index+1, numsLength, list);
                isVisit[i] = false;
            }
        }

        list.add(new ArrayList<>(){{for(int i=0; i<result.length; i++) add(result[i]);}});
    }
}