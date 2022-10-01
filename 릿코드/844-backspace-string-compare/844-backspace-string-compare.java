class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sb = new StringBuilder().append(s);
        for(int i=0, len=sb.length(); i<len; i++) {
            if(sb.charAt(i) == '#') {
                sb.deleteCharAt(i--);
                if(i >= 0) sb.deleteCharAt(i--);
                len=sb.length();
            }
        }
        StringBuilder sb2 = new StringBuilder().append(t);
        for(int i=0, len=sb2.length(); i<len; i++) {
            if(sb2.charAt(i) == '#') {
                sb2.deleteCharAt(i--);
                if(i >= 0) sb2.deleteCharAt(i--);
                len=sb2.length();
            }
        }
        return sb.toString().equals(sb2.toString());
    }
}