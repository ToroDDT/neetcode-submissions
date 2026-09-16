class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] memo = new int[n];
        Arrays.fill(memo, -1);
        return Math.min(dfs(0, memo, cost, n), dfs(1, memo, cost, n));
    }
    public int dfs(int i, int[] memo, int[] cost, int n) {
        if (i >= n) return 0;
        if (memo[i] != -1) return memo[i];
        return memo[i] = cost[i] + Math.min(dfs(i + 1, memo, cost, n), dfs(i + 2, memo, cost, n));
    }
}
