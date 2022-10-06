class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        StringBuilder sb1 = new StringBuilder().append(s);
        String[] sp = t.split("");
        for(String st : sp) {
            if(sb1.indexOf(st) != -1) sb1.deleteCharAt(sb1.indexOf(st));
        }
        return sb1.length() == 0;
    }
}