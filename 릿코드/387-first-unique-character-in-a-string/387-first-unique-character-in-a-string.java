class Solution {
    public int firstUniqChar(String s) {
        char[] c = s.toCharArray();
        for(int i=0, len=c.length; i<len; i++) {
            if(s.indexOf(c[i]) - s.lastIndexOf(c[i]) == 0) {
                return i;
            }
        }
        return -1;
    }
}