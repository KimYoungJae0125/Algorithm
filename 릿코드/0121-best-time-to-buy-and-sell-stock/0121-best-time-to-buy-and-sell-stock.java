class Solution {
    public int maxProfit(int[] prices) {
        int max = 0, min = Integer.MAX_VALUE;
        for(int i=0, len=prices.length; i<len; i++) {
            if(prices[i] < min) {
                min = prices[i];
                continue;
            }
            int sub = prices[i] - min;
            if(max < sub) max = sub;
        }
        return max;
    }
}