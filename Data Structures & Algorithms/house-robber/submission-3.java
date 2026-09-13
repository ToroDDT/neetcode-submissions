class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] memo = new int[n];
        Arrays.fill(memo, -1);
        return dfs(0, nums, memo);
    }
    public int dfs(int i, int[] nums, int[] memo) {
        if (i >= nums.length) return 0;
        if (memo[i] != -1) return memo[i];
        return memo[i] = Math.max(dfs(i + 1, nums, memo), nums[i] + dfs(i + 2, nums, memo));
    }
}


// State, what changes i == poisition
// dp(i) = 
// from position i what is the max amount of money you can get steal until you reach the end 
// what choices can i make 
// i can skip a house 
// i can rob and then skip ahead two house;
// base case: robbed every possible house
// i >= nums.length
// dp(i) = Max(dp(i + 1), nums[i] + df(i + 2));
