class Solution {
    public int balancedStringSplit(String s) {
        int result = 0, LCount = 0, RCount = 0;
        for(char c : s.toCharArray()) {
            if(c == 'L') LCount++;
            if(c == 'R') RCount++;
            if(LCount == RCount) {
                result++;
                LCount = 0;
                RCount = 0;
            }
        }
        return result;
    }
}