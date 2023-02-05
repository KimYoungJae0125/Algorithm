class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        for(int i=0, len=s.length(); i<len; i++) {
            List<Character> list = new ArrayList<>();
            for(int j=i; j<len; j++) {
                if(!list.contains(s.charAt(j))) {
                    list.add(s.charAt(j));
                } else {
                    break;
                }
            }
            max = Math.max(max, list.size());
        }
        return max;
    }
}