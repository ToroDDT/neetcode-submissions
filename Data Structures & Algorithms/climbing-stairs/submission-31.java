class Solution {
    public int climbStairs(int n) {
        int[] memo = new int[n];
        Arrays.fill(memo, -1);
        return dfs(0, n, memo);
    }
    public int dfs(int i, int n, int[] memo) {
        if (i >= n) return i == n ? 1 : 0;
        if (memo[i] != -1) return memo[i];
        return memo[i] = dfs(i + 1, n, memo) + dfs(i + 2, n, memo);
    }
}

// what is the state and the goal 
// the current state is the position
// i can track with i
    // what are out possible choices
    // i can move one 
    // i can move two
