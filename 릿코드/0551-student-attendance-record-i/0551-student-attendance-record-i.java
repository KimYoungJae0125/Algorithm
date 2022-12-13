class Solution {
    public boolean checkRecord(String s) {
       return s.indexOf("LLL") == -1 && s.indexOf("A") == s.lastIndexOf("A");
    }
}