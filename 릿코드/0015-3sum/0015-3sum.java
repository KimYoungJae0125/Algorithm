class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        var result = new HashSet<List<Integer>>();
        Arrays.sort(nums);
        for(int i=0, len=nums.length; i<len; i++) {
        int indexOne = 0, indexTwo = len-1;
            while(indexOne < indexTwo) {
                if(i == indexOne) indexOne++;
                if(i == indexTwo) indexTwo--;
                if(indexOne == indexTwo) break;
                int sum = nums[i] + nums[indexOne] + nums[indexTwo];
                if(sum == 0) {
                    int[] resultSum = new int[]{nums[i], nums[indexOne], nums[indexTwo]};
                    Arrays.sort(resultSum);
                    result.add(Arrays.asList(resultSum[0], resultSum[1], resultSum[2]));
                    indexOne++;
                }
                if(sum < 0) indexOne++;
                if(sum > 0) indexTwo--;
            }
        }
        return new ArrayList<>(result);
    }
}