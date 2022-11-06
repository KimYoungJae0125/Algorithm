class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        var result = new HashSet<List<Integer>>();
        Arrays.sort(nums);
        for(int i=0, len=nums.length-2; i<len; i++) {
        int indexOne = i+1, indexTwo = len+1;
            while(indexOne < indexTwo) {                
                if(indexOne == indexTwo) break;
                int sum = nums[i] + nums[indexOne] + nums[indexTwo];
                if(sum == 0) result.add(Arrays.asList(nums[i], nums[indexOne++], nums[indexTwo--]));
                if(sum < 0) indexOne++;
                if(sum > 0) indexTwo--;
            }
        }
        return new ArrayList<>(result);
    }
}