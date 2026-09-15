class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] memo = new int[amount + 1];
        Arrays.fill(memo, -1);

        int res = dfs(amount, coins, memo);

        return res == Integer.MAX_VALUE ? -1 : res;
    }

    public int dfs(int amount, int[] coins, int[] memo) {

        if (amount == 0) {
            return 0;
        }

        if (memo[amount] != -1) {
            return memo[amount];
        }

        int min = Integer.MAX_VALUE;

        for (int coin : coins) {

            if (amount - coin >= 0) {

                int res = dfs(amount - coin, coins, memo);

                if (res != Integer.MAX_VALUE) {
                    min = Math.min(min, 1 + res);
                }
            }
        }

        memo[amount] = min;
        return min;
    }
}
