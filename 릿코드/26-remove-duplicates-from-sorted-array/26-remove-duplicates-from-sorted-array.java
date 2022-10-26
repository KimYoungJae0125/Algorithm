class Solution {
    public int removeDuplicates(int[] nums) {
        var removeDuplicatesNums = new HashSet<>(){{for(int num : nums) add(num);}}.toArray(Integer[]::new);
        Arrays.sort(removeDuplicatesNums);
        int count = removeDuplicatesNums.length;
        for(int i=0, len=nums.length; i<len; i++)
            if(i < count) nums[i] = removeDuplicatesNums[i];
            else nums[i] = -1;
        return count;
    }
}