class Solution {
    public List<List<Integer>> res;

    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> subset = new ArrayList<>();
        res = new ArrayList<>();
        dfs(0,subset,nums);
        return res;
    }

    public void dfs(int i, List<Integer> subset, int[] nums) {
        if (i >= nums.length) {
            res.add(new ArrayList<>(subset));
            return;
        }
        // this includes the number
        subset.add(nums[i]);
        dfs(i + 1, subset, nums);
        // this excludes the number
        subset.remove(subset.size() - 1);
        dfs(i + 1, subset, nums);
    }
}
