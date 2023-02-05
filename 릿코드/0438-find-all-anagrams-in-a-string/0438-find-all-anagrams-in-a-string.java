class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int length = p.length();
        char[] pc = p.toCharArray();
        Arrays.sort(pc);
        List<Integer> result = new ArrayList<>();
        for(int i=0, len=s.length()-length+1; i<len; i++) {
            char[] sc = s.substring(i, i+length).toCharArray();
            Arrays.sort(sc);
            if(Arrays.equals(sc, pc)) {
                result.add(i);
            }

        }
        return result;
    }
}