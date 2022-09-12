class Solution {
    public int partitionString(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()) {
            if(sb.indexOf(String.valueOf(c), sb.lastIndexOf("/")) == -1) sb.append(c);
            else sb.append("/").append(c);
        }
        return sb.toString().split("/").length;
    }
}