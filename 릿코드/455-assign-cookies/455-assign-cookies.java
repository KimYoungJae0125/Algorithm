class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int[] s2 = Arrays.stream(s).sorted().toArray();
        return (int) Arrays.stream(g).sorted().filter(i ->{
            for(int j=0, len=s2.length; j<len; j++) {
                if(s2[j] >= i) {
                    s2[j] = -1;
                    return true;
                }
            }
            return false;
        }).count();
    }
}