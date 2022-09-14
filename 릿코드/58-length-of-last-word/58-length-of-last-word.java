class Solution {
    public int lengthOfLastWord(String s) {
        String[] sS = s.split(" ");
        return sS[sS.length-1].length();
    }
}