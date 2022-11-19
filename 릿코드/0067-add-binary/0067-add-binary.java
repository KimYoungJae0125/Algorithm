class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        char[] s1 = a.toCharArray();
        char[] s2 = b.toCharArray();
        int len1 = s1.length, len2 = s2.length;
        int len = Math.max(len1, len2);
        int[] sum = new int[len+1];
        for(int i=1; i<=len; i++) {
            if(i<=len1) 
                sum[i-1] += Character.getNumericValue(s1[len1-i]);
            if(i<=len2) 
                sum[i-1] += Character.getNumericValue(s2[len2-i]);
            if(sum[i-1] >= 2) {
                sum[i-1] -= 2;
                sum[i]++;
            }
            sb.append(sum[i-1]);
        }
        if(sum[len] != 0)
            sb.append(sum[len]);
        return sb.reverse().toString();
    }
}