class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        StringBuilder sb1 = new StringBuilder().append(s);
        String[] sp = t.split("");
        for(int i=0, len=sb1.length(); i<len; i++) {
            int index = sb1.indexOf(sp[i]);
            if(index != -1) sb1.deleteCharAt(index);
        }
        return sb1.length() == 0;
    }
}