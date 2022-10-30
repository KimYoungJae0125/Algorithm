public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int result = 0;
        for(char c : Integer.toBinaryString(n).toCharArray()) {
            result += Character.getNumericValue(c);
        } 
        return result;
    }
}