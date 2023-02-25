class Solution {
    public int maxProfit(int[] prices) {
        int max = 0
          , min = 999_999_999
          , index = 0
          , length = prices.length;

        for(int i=0; i<length; i++) {
            if(min > prices[i]) {
                min = prices[i];
                index = i;
            }
            int sub = 0;
            if(max < (sub = prices[i] - prices[index])) 
                max = sub;
        }
        return max;
    }
}