class Solution {
    public char findTheDifference(String s, String t) {
        StringBuilder sb = new StringBuilder().append(t);
        for(char c : s.toCharArray()) {
            int index = sb.indexOf(String.valueOf(c));
            if(index != -1) {
                sb.deleteCharAt(index);
            }
        }
        return sb.charAt(0);
    }
}