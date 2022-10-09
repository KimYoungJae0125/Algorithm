class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        StringBuilder sb = new StringBuilder().append(ransomNote);
        for(String s : magazine.split("")) {
            int index = sb.indexOf(s);
            if(index != -1) {
                sb.deleteCharAt(index);
            }
        }
        return sb.length() == 0;
    }
}