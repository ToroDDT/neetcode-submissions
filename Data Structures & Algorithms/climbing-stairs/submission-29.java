class Solution {
    public int climbStairs(int n) {
        int[] memo = new int[n];
        Arrays.fill(memo, -1);
        return dfs(0, n, memo);
    }
    public int dfs(int i, int n, int[] memo) {
        if (i == n) return 1; 
        if (i > n) return 0;
        if(memo[i] != -1) return memo[i];
        return memo[i] = dfs(i + 1, n, memo) + dfs(i + 2, n, memo);
    } 
}

// what is the goal, to reach the top
// get all the possible ways;
// what is the state, what changes? the position changes..abstract
// so (i) is the state;
// what choices i can make?
    // i can go up one stair
    // form i can i go up two stairs
// f(i) {if i < n, dp(i + 1), dp(i + 2), if i == n 0 stairs left, i > n, this is an impossible state};