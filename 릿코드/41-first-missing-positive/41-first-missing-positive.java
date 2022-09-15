class Solution {
    public int firstMissingPositive(int[] nums) {
        int[] count = {1};
        return  Arrays.stream(Arrays.stream(nums).distinct().sorted()
                        .filter(i -> i>0)
                        .filter(i -> i==count[0])
                        .filter(i -> i==count[0]++)
                        .toArray())
                        .filter(i -> i==count[0]-1)
                        .map(i -> i+1)
                        .findFirst()
                        .orElse(1);
    }
}