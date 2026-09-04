class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> subsets(int[] nums) {
        res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        dfs(nums, subset, 0);
        return res;
    }
    public void dfs(int[] nums, List<Integer> subset, int i) {
        if (i == nums.length) {
            this.res.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[i]);
        dfs(nums, subset, i + 1);
        subset.remove(subset.size() - 1);
        dfs(nums, subset, i + 1);
    }
}
