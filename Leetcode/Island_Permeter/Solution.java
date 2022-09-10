package Leetcode.Island_Permeter;

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().islandPerimeter(new int[][]{{0, 1, 0, 0}, {1,1,1,0},{0,1,0,0},{1,1,0,0}}));
        System.out.println(new Solution().islandPerimeter(new int[][]{{1}}));
        System.out.println(new Solution().islandPerimeter(new int[][]{{1, 0}}));
    }
    public int islandPerimeter(int[][] grid) {
        int result = 0;
        for(int i=0, len=grid.length; i<len; i++)
            for(int j=0, innerLen=grid[i].length; j<innerLen; j++)
                if(grid[i][j] == 1) {
                    result += 4;
                    if(j > 0) if(grid[i][j-1] == 1) result -= 1;
                    if(j < innerLen-1) if(grid[i][j+1] == 1) result -= 1;
                    if(i > 0) if(grid[i-1][j] == 1) result -= 1;
                    if(i < len-1) if(grid[i+1][j] ==1) result -= 1;
                }
        return result;
    }
}
