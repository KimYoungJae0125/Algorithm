class Solution {
    public String addStrings(String num1, String num2) {
               char[] c1 = num1.toCharArray(), c2 = num2.toCharArray();
        int c1Len = c1.length, c2Len = c2.length, maxLen = Math.max(c1Len, c2Len);
        StringBuilder sb = new StringBuilder();
        int index=1;
        int[] sum = new int[maxLen];
        while(maxLen-index >=0) {
            if(c1Len-index >= 0)
                sum[maxLen-index] += Character.getNumericValue(c1[c1Len-index]);
            if(c2Len-index >= 0)
                sum[maxLen-index] += Character.getNumericValue(c2[c2Len-index]);

            if(sum[maxLen-index] >= 10) {
                int quotientSum = sum[maxLen-index]/10
                  , remainderSum = sum[maxLen-index]%10;
                if(maxLen-index-1 >= 0) {
                    sum[maxLen-index-1] = quotientSum;
                    sum[maxLen-index] = remainderSum;
                } else {
                    sb.append(remainderSum).append(quotientSum);
                    break;
                }
            }
            sb.append(sum[maxLen-index]);
            index++;
        }
        return sb.reverse().toString();
    }
}