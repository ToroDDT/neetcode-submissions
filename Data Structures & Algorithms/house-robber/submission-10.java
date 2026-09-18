class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] memo = new int[n];
        Arrays.fill(memo, -1);
        return dfs(0, memo, nums);
    }
    public int dfs(int i, int[] memo, int[] nums) {
        if (i >= nums.length) {
            return 0;
        }
        if (memo[i] != -1) return memo[i];
        return memo[i] = Math.max(dfs(i + 1, memo, nums), nums[i] + dfs(i + 2, memo, nums));
    }
}

// what is the state, what changes? 
// the state is the position 
// so when we are at a house, what are our choices?
// choice one: skip the house 
// choice two: rob and the skip ahead by two;
// dp(i) = from position i what is highest amont i can rob until i reach the end? 
// dp(i) = Max(f(i + 1), nums[i] + f(i + 1));
// what are the possible outcomes? 
// if they are no houses then i can only rob zero
// or if im at the end the maximun i can only rob zero
