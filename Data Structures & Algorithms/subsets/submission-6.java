class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> subset = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        dfs(0, subset, res, nums);
        return res;
    }
    public void dfs(int i, List<Integer> subset, List<List<Integer>> res, int[] nums) {
        if (i >= nums.length) {
            res.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[i]);
        dfs(i + 1, subset, res, nums);
        subset.remove(subset.size() - 1);
        dfs(i + 1, subset, res, nums);
    }
}
