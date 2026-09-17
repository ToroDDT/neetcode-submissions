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


// what is the state 
// the state is the position, the variable that can track the positoin 
// can be (i);
// so what is the dp()?
// dp(i) = from i what are all the possible ways to reach the top
// what choices i can do?
// i can choose one step or two steps from position i
// if computed (i) already, the amount of possible choices remain the same always, so i can use memoization 
