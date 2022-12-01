class Solution {
    public int fib(int n) {
        if(n == 0) return 0;
        int[] fibNum = new int[n+1];
        fibNum[1] = 1;
        for(int i=2; i<=n; i++) {
            fibNum[i] = fibNum[i-1]+fibNum[i-2];
        }
        return fibNum[n];
    }
}