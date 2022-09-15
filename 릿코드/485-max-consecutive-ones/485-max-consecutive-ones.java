class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        StringBuilder sb = new StringBuilder();
        for(int num : nums) sb.append(num);
        int max = 0;
        for(String s : sb.toString().split("0")) if(s.length() > max) max = s.length();
        return max;
    }
}