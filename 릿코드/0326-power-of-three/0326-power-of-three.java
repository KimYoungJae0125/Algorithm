class Solution {
    public boolean isPowerOfThree(int n) {
        if(n < 1) return false;
        if(n == 1) return true;
        int a = 3;
        for(int i=0; i<31; i++){
            if(n-a == 0) return true;
            a *= 3;
        }

        return false;    }
}