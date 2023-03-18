class Solution {
    public int numIslands(char[][] grid) {
        int length1 = grid.length, length2 = grid[0].length;
        boolean[][] visited = new boolean[length1][length2];
        int result = 0;
        for(int i = 0; i < length1; i++) {
            for(int j = 0; j < length2; j++) {
                if(!visited[i][j] && grid[i][j] == '1') {
                    check(visited, grid, i, j, length1, length2);
                    result++;
                }
            }
        }
        return result;
    }

    private void check(boolean[][] visited, char[][]grid, int i, int j, int length1, int length2) {
        visited[i][j] = true;
        if(j > 0 && !visited[i][j-1] && grid[i][j-1] == '1') {
            check(visited, grid, i, j-1, length1, length2);
        }
        if(j < length2-1 && !visited[i][j+1] && grid[i][j+1] == '1') {
            check(visited, grid, i, j+1, length1, length2);
        }
        if(i > 0 && !visited[i-1][j] && grid[i-1][j] == '1') {
            check(visited, grid, i-1, j, length1, length2);
        }
        if(i < length1-1 && !visited[i+1][j] && grid[i+1][j] == '1') {
            check(visited, grid, i+1, j, length1, length2);
        }
    }
}