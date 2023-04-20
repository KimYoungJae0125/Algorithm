import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int n, int[][] edge) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n];
        queue.offer(1);
        visited[0] = true;
        int length = edge.length;
        int result = 0;
        while(true) {
            int count = 0;
            Queue<Integer> innerQueue = new LinkedList<>();
            while(!queue.isEmpty()) {
                innerQueue.offer(queue.poll());
            }
            while(!innerQueue.isEmpty()) {
                int node = innerQueue.poll();
                for(int i = 0; i < length; i++) {
                    if(edge[i][0] == node || edge[i][1] == node) {
                        int index = 0;
                        if(edge[i][0] == node && !visited[(index = edge[i][1] - 1)]) {
                            queue.offer(edge[i][1]);
                            count++;
                        }
                        if(edge[i][1] == node && !visited[(index = edge[i][0] - 1)]) {
                            queue.offer(edge[i][0]);
                            count++;
                        }
                        visited[index]= true;
                    }
                }
            }
            if(queue.isEmpty()) break;
            result = count;
        }
        return result;
    }
}