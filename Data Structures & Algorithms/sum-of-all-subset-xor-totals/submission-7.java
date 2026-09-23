class Solution {
    public int subsetXORSum(int[] nums) {
        return dfs(0, nums, 0);
    }
    public int dfs(int i, int[] nums, int countXor) {
        if (i == nums.length) {
            return countXor;
        }
        int include = dfs(i + 1, nums, countXor ^ nums[i]);
        int exclude = dfs(i + 1, nums, countXor);
        return include + exclude;
    }
}