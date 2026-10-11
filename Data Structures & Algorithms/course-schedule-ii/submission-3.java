class Solution {
    public HashMap<Integer, List<Integer>> map = new HashMap<>();
    public HashSet<Integer> visited = new HashSet<>(); // Current path cycle detector
    public HashSet<Integer> added = new HashSet<>();   // Tracks what's already added to res
    public List<Integer> res = new ArrayList<>();

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        for (int i = 0; i < numCourses; i++) {
            map.put(i, new ArrayList<>());
        }
        for (int[] pre : prerequisites) {
            map.get(pre[0]).add(pre[1]);
        }

        for (int i = 0; i < numCourses; i++) {
            if (!dfs(i)) {
                return new int[]{}; // Cycle found, impossible to finish
            }
        }
        
        return res.stream()
                  .mapToInt(Integer::intValue)
                  .toArray();
    }

    public boolean dfs(int i) {
        // If it's already fully processed and added, we can skip it safely
        if (added.contains(i)) {
            return true;
        }
        // If it's currently in our active path, we found a cycle!
        if (visited.contains(i)) {
            return false;
        }

        visited.add(i); // Mark as visiting on this path

        for (int pre : map.get(i)) {
            if (!dfs(pre)) {
                return false;
            }
        }

        visited.remove(i); // Backtrack
        added.add(i);      // Mark as fully done
        res.add(i);        // Add to result AFTER prerequisites are done!
        
        return true;
    }
}