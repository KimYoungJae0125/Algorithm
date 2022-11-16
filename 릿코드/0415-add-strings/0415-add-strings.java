class Solution {
    public String addStrings(String num1, String num2) {
        char[] c1 = num1.toCharArray(), c2 = num2.toCharArray();
        int c1Len = c1.length, c2Len = c2.length, maxLen = Math.max(c1Len, c2Len);
        int index=1;
        int[] sum = new int[maxLen];
        int sumIndex;
        while((sumIndex = maxLen-index) >=0) {
            if(c1Len-index >= 0)
                sum[sumIndex] += Character.getNumericValue(c1[c1Len-index]);
            if(c2Len-index >= 0)
                sum[sumIndex] += Character.getNumericValue(c2[c2Len-index]);

            if(sum[sumIndex] >= 10 && sumIndex-1 >= 0) {
                sum[sumIndex-1] = sum[sumIndex]/10;
                sum[sumIndex] = sum[sumIndex]%10;
            }
            index++;
        }
        return Arrays.toString(sum).replaceAll("[^0-9]","");    }
}