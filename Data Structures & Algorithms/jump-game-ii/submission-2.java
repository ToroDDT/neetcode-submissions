class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);

        return dfs(0, nums, dp);
    }

    private int dfs(int i, int[] nums, int[] dp) {
        if (i >= nums.length - 1) {
            return 0;
        }

        if (dp[i] != -1) {
            return dp[i];
        }

        int res = Integer.MAX_VALUE;

        for (int j = 1; j <= nums[i] && i + j < nums.length; j++) {
            int jumps = dfs(i + j, nums, dp);

            if (jumps != Integer.MAX_VALUE) {
                res = Math.min(res, 1 + jumps);
            }
        }

        dp[i] = res;
        return dp[i];
    }
}