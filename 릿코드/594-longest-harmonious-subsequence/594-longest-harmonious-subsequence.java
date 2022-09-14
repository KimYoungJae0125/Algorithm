class Solution {
    public int findLHS(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int[] newNums = Arrays.stream(nums).distinct().sorted().toArray();
        for(int i=0, len=newNums.length; i<len-1; i++) {
            if(newNums[i+1] - newNums[i] == 1) set.add(newNums[i]);
        }
        int count = 0;
        for(int i : set) {
            int secondCount = 0;
            for(int num : nums) if(i == num || i+1 == num) secondCount++;
            if(count < secondCount) count = secondCount;
        }
        return count;
    }
}