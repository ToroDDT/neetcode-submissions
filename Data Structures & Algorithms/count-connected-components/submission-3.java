class Solution {
    HashMap<Integer, List<Integer>> map = new HashMap<>();
    HashSet<Integer> visited = new HashSet<>();
    public int countComponents(int n, int[][] edges) {
        int res = 0;
        for (int i = 0; i < n; i++) {
            map.put(i, new ArrayList<>());
        }
        for (int[] edge : edges) {
            map.get(edge[0]).add(edge[1]);
            map.get(edge[1]).add(edge[0]);
        }
        for (int i = 0; i < n; i++) {
            if (!visited.contains(i)) {
                dfs(i);
                res++;
            }
        }
        return res;
    }
    public void dfs(int node) {
        visited.add(node);
        for (int nei : map.get(node)){
            if (!visited.contains(nei)) {
                dfs(nei);
            }
        }
    }
}
