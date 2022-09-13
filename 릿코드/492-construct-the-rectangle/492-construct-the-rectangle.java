class Solution {
    public int[] constructRectangle(int area) {
        int min = 999_999_999;
        int[] result = new int[2];
        for(int i = (int) Math.sqrt(area); i<=min; i++) {
            for(int j=1, len = area/i; j<=len && i>=j; j++) {
                if(i * j == area) {
                        min = i - j;
                        result[0] = i;
                        result[1] = j;
                }
            }
        }
        return result;
    }
}