class Solution {
    public int partitionString(String s) {
        char[] c = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=0, len=c.length; i<len; i++) {
            if(sb.indexOf(String.valueOf(c[i]), sb.lastIndexOf("/")) == -1) sb.append(c[i]);
            else sb.append("/").append(c[i]);
        }
        return sb.toString().split("/").length;
    }
}