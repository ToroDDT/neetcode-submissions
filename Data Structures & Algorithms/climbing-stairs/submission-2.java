class Solution {
    public int climbStairs(int n) {
        int[] cache = new int[n];
        for (int i = 0; i < n; i++){
            cache[i] = -1;
        }
        return dfs(0, cache, n);
    }
    public int dfs(int i, int[] cache, int n) {
        if (i >= n) return i == n ? 1 : 0;
        if (cache[i] != -1) {
            return cache[i];
        }
        return cache[i] = dfs(i + 1, cache, n) + dfs(i + 2, cache, n);
    }
}
