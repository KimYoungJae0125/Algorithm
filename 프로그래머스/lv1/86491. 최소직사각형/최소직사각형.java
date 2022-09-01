class Solution {
    public int solution(int[][] sizes) {
        int[] max = {-1, -1};
        for(int i=0, len= sizes.length; i<len; i++) if(sizes[i][0] < sizes[i][1]) {
                int beforeInt = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = beforeInt;
            }
        for(int i=0, len= sizes.length;i<len; i++) for(int j=0; j<2; j++) if(max[j] < sizes[i][j]) max[j] = sizes[i][j];
        return max[0] * max[1];
    }
}