class Solution {
    public int[] constructRectangle(int area) {
        int min = 999_999_999;
        int[] result = new int[2];
        for(int i=1; i<=area; i++) {
            if(i > min) break;
            for(int j=1; j<=area/i; j++) {
                if(i < j) break;
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