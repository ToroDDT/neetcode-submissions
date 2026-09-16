class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] memo = new int[n];
        Arrays.fill(memo, -1);
        return dfs(0, nums, memo);
    }

    public int dfs(int i, int[] nums, int[] memo) {
        if(i >= nums.length) return 0;
        if (memo[i] != -1) return memo[i];
        return memo[i] = Math.max(dfs(i + 1, nums, memo), nums[i] +dfs(i + 2, nums, memo));
    }
}

// what is the state? what changes??
// the position is the state. what value or variable can track it? 
// what are the options? 
// I can skip a house or I can rob and then skip two houses;
// (i) can track it.. So what the dp problem? 
// dp(i) = from position (i) what the max amount of amount i can rob? 
// how do formulazite this?
// dp(i) = Max(dp(i + 1), nums[i] + dp(i + 1));
