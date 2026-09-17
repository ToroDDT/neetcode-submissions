class Solution {
    public int coinChange(int[] coins, int amount) {
        // define the state
        // f(x) = the minium amount of coins to reach amount;
        // the state variable will be amount
        int[] memo = new int[amount + 1];
        Arrays.fill(memo, -1);
        int res = dfs(coins, amount, memo);
        return Integer.MAX_VALUE == res ? -1 : res;
    }
    // what choices can I make? 
    // i can choose every single coin;
    public int dfs(int[] coins, int amount, int[] memo) {
        if (amount == 0) return 0;
        if (amount < 0) return Integer.MAX_VALUE;
        if (memo[amount] != -1) return memo[amount];
        int min = Integer.MAX_VALUE;
        for (int coin : coins) {
            int res = dfs(coins, amount - coin, memo);
            if (res != Integer.MAX_VALUE) {
                min = Math.min(min, 1 + res);
            }
        }
        memo[amount] = min;
        return memo[amount];
    }
}
