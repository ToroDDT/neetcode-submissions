class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        Arrays.sort(nums);
        res = new ArrayList<>();
        dfs(0, nums, new ArrayList<>(), 0, target);
        return res;
    }
    public void dfs(int i, int[] nums, List<Integer> subset, int total, int target) {
        if (total == target) {
            this.res.add(new ArrayList<>(subset));
            return;
        }
        for (int j = i; j < nums.length; j++) {
            if (nums[j] + total > target) {
                return;
            }
            subset.add(nums[j]);
            dfs(j, nums, subset, total + nums[j], target);
            subset.remove(subset.size() - 1);
        }
    }
}
