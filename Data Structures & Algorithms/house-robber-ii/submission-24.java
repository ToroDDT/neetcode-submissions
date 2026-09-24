class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        int[] memo1 = new int[n];
        int[] memo2 = new int[n];
        Arrays.fill(memo1, -1);
        Arrays.fill(memo2, -1);
        return Math.max(dfs(0, nums, memo1, n - 1), dfs(1, nums, memo2, n));
    }
    public int dfs(int i, int[] nums, int[] memo, int end){
        if (i >= end) {
            return 0;
        }
        if (memo[i] != -1) return memo[i];
        return memo[i] = Math.max(dfs(i + 1, nums, memo, end), nums[i] + dfs(i + 2, nums, memo, end));
    }

}
