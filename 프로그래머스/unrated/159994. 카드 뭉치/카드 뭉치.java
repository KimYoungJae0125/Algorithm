class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int i1 = 0, i2 = 0;
        for(String str : goal) {
            if(i1 < cards1.length && str.equals(cards1[i1])) {
                i1++;
                continue;
            }
            if(i2 < cards2.length && str.equals(cards2[i2])) {
                i2++;
            }
        }
        return i1+i2 == goal.length ? "Yes" : "No";
    }
}