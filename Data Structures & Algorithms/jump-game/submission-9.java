
class Solution {
    public boolean canJump(int[] nums) {
        Boolean[] dp = new Boolean[nums.length];
        return dfs(0, nums, dp);
    }

    private boolean dfs(int i, int[] nums, Boolean[] dp) {
        if (i >= nums.length - 1) {
            return true;
        }
        if (dp[i] != null) {
            return dp[i];
        }
        int maxJump = nums[i];
        for (int jump = 1; jump <= maxJump; jump++) {
            if (dfs(i + jump, nums, dp)) {
                return dp[i] = true;
            }
        }
        return dp[i] = false;
    }
}