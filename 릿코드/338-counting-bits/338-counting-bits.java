class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n+1];
        for(int i=0; i<=n; i++) {
            for(char c : Integer.toBinaryString(i).toCharArray()) {
                result[i] += Character.getNumericValue(c);
            }
        }
        return result;
    }
}