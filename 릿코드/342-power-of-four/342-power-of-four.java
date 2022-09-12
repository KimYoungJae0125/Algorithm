class Solution {
    public boolean isPowerOfFour(int n) {
        int X = 1;
        for(int i=0; i<16; i++) {
            if(n == X) return true;
            X*=4;
        }
        return false;
    }
}