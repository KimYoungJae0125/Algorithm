class Solution {
    public String longestCommonPrefix(String[] strs) {
        int minIndex = 0;
        int min = 999_999_999;
        for(int i=0, len=strs.length; i<len; i++) {
            if(strs[i].length() < min) {
                min = strs[i].length();
                minIndex = i;
            }
        }
        for(int i=0; i<min; i++) {
            for(int j=0, len=strs.length-1; j<len; j++) {
                if(strs[j].charAt(i) != strs[j+1].charAt(i)) return strs[0].substring(0, i);
            }
        }

        return strs[minIndex];
    }
}