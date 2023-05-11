class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> resultPath = new ArrayList<>();
        int lastNode = graph.length - 1;

        Queue<List<Integer>> queue = new LinkedList<>();
        List<Integer> startPath = new ArrayList<>();
        startPath.add(0);
        queue.offer(startPath);

        while (!queue.isEmpty()) {
            List<Integer> path = queue.poll();
            int currentNode = path.get(path.size() - 1);

            if (currentNode == lastNode) {
                resultPath.add(path);
                continue;
            }

            for (int neighbor : graph[currentNode]) {
                List<Integer> newPath = new ArrayList<>(path);
                newPath.add(neighbor);
                queue.offer(newPath);
            }
        }

        return resultPath;
    }
}