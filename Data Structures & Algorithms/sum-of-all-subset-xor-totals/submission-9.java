class Solution {
    public int subsetXORSum(int[] nums) {
        return dfs(0, nums, 0);
    }
    public int dfs(int i, int[] nums, int total) {
        if (i >= nums.length) {
            return total;
        }
        int include = dfs(i + 1, nums, total ^ nums[i]);
        int exclude = dfs(i + 1, nums, total);
        return include + exclude;
    }
}