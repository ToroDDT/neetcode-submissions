class Solution {
    public int climbStairs(int n) {
        int[] memo = new int[n];
        Arrays.fill(memo, -1);
        return dfs(0, memo, n);
    }
    public int dfs(int i, int[] memo, int n) {
        if (i >= n) return i == n ? 1 : 0;
        if (memo[i] != - 1) return memo[i];
        return memo[i] = dfs(i + 1, memo, n) + dfs(i + 2, memo, n);
    }
}
