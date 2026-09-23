class Solution {
        public List<List<Integer>> res;
    public List<List<Integer>> subsets(int[] nums) {
        res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        dfs(0, subset, nums);
        return res;
    }
    public void dfs (int i, List<Integer> subset, int[] nums) {
        if (i >= nums.length) {
            this.res.add(new ArrayList<>(subset));
            return;
        }
        // include the number
        subset.add(nums[i]);
        dfs(i + 1, subset, nums);
        subset.remove(subset.size() -1);
        dfs(i + 1, subset, nums);
    }
}
