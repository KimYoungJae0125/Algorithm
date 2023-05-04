class Solution {
    public int solution(int n, int[][] results) {
        int[][] graph = new int[n][n];

        for(int i = 0, length = results.length; i < length; i++) {
            int[] result = results[i];
            int winner = result[0] - 1;
            int loser = result[1] - 1;
            graph[winner][loser] = 1;
            graph[loser][winner] = -1;
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                for(int k = 0; k < n; k++) {
                    if(graph[i][k] == 1 && graph[k][j] == 1) {
                        graph[i][j] = 1;
                        graph[j][i] = -1;
                    }
                    if(graph[i][k] == -1 && graph[k][j] == -1) {
                        graph[i][j] = -1;
                        graph[j][i] = 1;
                    }
                }
            }
        }
        int answer = 0;

        for(int i = 0; i < n; i++) {
            int cnt = 0;
            for(int j = 0; j < n; j++) {
                if(graph[i][j] != 0) cnt++;
            }
            if(cnt == n - 1) answer++;
        }

        return answer;
    }
}