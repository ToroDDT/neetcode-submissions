class Solution {
    public List<List<Integer>> res;
    public List<List<Integer>> subsets(int[] nums) {
        res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        dfs(0, nums, subset);
        return res;
    }
    public void dfs(int i, int[] nums, List<Integer> subset) {
        if (i >= nums.length) {
            this.res.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[i]);
        dfs(i + 1, nums, subset);
        subset.remove(subset.size() - 1);
        dfs(i + 1, nums, subset);
    }
}
