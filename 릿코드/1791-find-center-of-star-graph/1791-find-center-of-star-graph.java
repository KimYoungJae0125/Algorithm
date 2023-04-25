class Solution {
    public int findCenter(int[][] edges) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int[] edge : edges) {
            map.put(edge[0], map.getOrDefault(edge[0], 0) + 1);
            map.put(edge[1], map.getOrDefault(edge[1], 0) + 1);
        }
        return map.entrySet().stream().sorted((m1, m2) -> m2.getValue() - m1.getValue()).findFirst().get().getKey();
    }
}