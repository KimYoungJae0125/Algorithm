class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        for(int i = 0, length = nums.length; i < length; i++) {
            dfs(result, new ArrayList<>(), nums, i, length);
        }
        return result;
    }
    void dfs(List<List<Integer>> result, List<Integer> list, int[] nums, int index, int length) {
        list.add(nums[index]);
        result.add(new ArrayList<>(list));
        for(int i = index + 1; i < length; i++) {
            dfs(result, list, nums, i, length);
            list.remove(list.indexOf(nums[i]));
        }
    }
}