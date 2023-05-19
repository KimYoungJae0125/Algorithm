class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0, length=nums.length - 2; i < length; i++) {
            int left = i + 1;
            int right = length + 1;
            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0) {
                    List<Integer> list = new ArrayList<>(3);
                    list.add(nums[i]);
                    list.add(nums[left++]);
                    list.add(nums[right--]);
                    result.add(list);
                }
                else if(sum < 0) left++;
                else right--;
            }
        }
        return new ArrayList<>(result);
    }
}