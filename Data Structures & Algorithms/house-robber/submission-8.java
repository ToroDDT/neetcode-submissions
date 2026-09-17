class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] memo = new int[n];
        Arrays.fill(memo, -1);
        return dfs(0, nums, memo);
    }
    public int dfs(int i, int[] nums, int[] memo){
        if (i >= nums.length) return 0;
        if (memo[i] != -1) return memo[i];
        return memo[i] = Math.max(dfs(i + 1, nums, memo), nums[i] + dfs(i + 2, nums, memo));
    }
}
