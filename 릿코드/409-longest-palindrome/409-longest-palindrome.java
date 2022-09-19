class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>(){{
            for(char c : s.toCharArray()) put(c, get(c) == null ? 1 : get(c) + 1);
        }};
        int result = map.keySet().stream().mapToInt(k -> {
            int mapResult = map.get(k);
            if(mapResult%2 == 1) {
                mapResult-=1;
            }
            return mapResult;
        }).sum();
        if(result < s.length()) result++;
        return result;
    }
}