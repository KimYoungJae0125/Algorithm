class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> answer = new ArrayList<>();
        Queue<List<Integer>> queue = new LinkedList<>();
        queue.add(Arrays.asList(0));
        int dest = graph.length -1;

        while (!queue.isEmpty()) {
            final var path = queue.poll();
            final var now = path.get(path.size() - 1); // 마지막 경로 (현재 위치한 노드)

            if (now == dest) {
                answer.add(new ArrayList<>(path));
            } else {

                for (int node : graph[now]) {
                    List<Integer> newPath = new ArrayList<>(path);
                    newPath.add(node);

                    queue.add(newPath);
                }
            }
        }

        return answer;
    }
}