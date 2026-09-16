class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] memo = new int[n];
        Arrays.fill(memo, -1);
        return Math.min(dfs(1, cost, memo), dfs(0, cost, memo));
    }
    public int dfs(int i, int[] cost, int[] memo) {
        if (i >= cost.length) return i == cost.length ? 0 : Integer.MAX_VALUE;
        if (memo[i] != -1) return memo[i];
        return memo[i] = cost[i] + Math.min(dfs(i + 1, cost, memo), dfs(i + 2, cost, memo));
    }
}
