import java.util.Queue;
import java.util.LinkedList;

class Solution {

    public int solution(int[][] maps) {
        int xLength = maps[0].length, yLength = maps.length;
        boolean[][] visited = new boolean[yLength][xLength];
        int[] dx = {1,0,-1,0}, dy = {0, 1, 0, -1};
        Queue<int[]> queue = new LinkedList<>();
        
        queue.offer(new int[]{0,0,1});
        visited[0][0] = true;
        
        while (!queue.isEmpty()) {
          int[] xyCount = queue.poll();
          int x = xyCount[0], y = xyCount[1], count = xyCount[2];

          if(x == xLength-1 && y == yLength-1) 
              return count;
          
          for(int i = 0; i < 4; i++) {
              int nx = x+dx[i], ny = y+dy[i];
              if(
                (nx < 0 || nx >= xLength) || (ny < 0 || ny >= yLength)
                || visited[ny][nx]
                || maps[ny][nx] != 1
              ) continue;
              visited[ny][nx] = true;
              queue.offer(new int[]{nx, ny, count+1});
          }
        }

        return -1;
    }

}