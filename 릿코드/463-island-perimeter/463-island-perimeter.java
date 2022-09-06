class Solution {
    public int islandPerimeter(int[][] grid) {
        int result = 0;
        for(int i=0, len=grid.length; i<len; i++)
            for(int j=0, innerLen=grid[i].length; j<innerLen; j++)
                if(grid[i][j] == 1) {
                    result += 4;
                    if(j > 0 && grid[i][j-1] == 1) result -= 1;
                    if(j < innerLen-1 && grid[i][j+1] == 1) result -= 1;
                    if(i > 0 && grid[i-1][j] == 1) result -= 1;
                    if(i < len-1 && grid[i+1][j] ==1) result -= 1;
                }
        return result;        
    }
}