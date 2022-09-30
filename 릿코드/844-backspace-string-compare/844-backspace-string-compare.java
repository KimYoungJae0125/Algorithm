class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sb = new StringBuilder().append(s);
        for(int i=0; i<sb.length(); i++) {
            if(sb.charAt(i) == '#') {
                sb.deleteCharAt(i);
                i--;
                if(i >= 0) {
                    sb.deleteCharAt(i);
                    i--;
                }
            }
        }
        StringBuilder sb2 = new StringBuilder().append(t);
        for(int i=0; i<sb2.length(); i++) {
            if(sb2.charAt(i) == '#') {
                sb2.deleteCharAt(i);
                i--;
                if(i >= 0) {
                    sb2.deleteCharAt(i);
                    i--;
                }
            }
        }
        return sb.toString().equals(sb2.toString());
    }
}