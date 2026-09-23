class Solution {
    public List<List<Integer>> res;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        Arrays.sort(nums);
        res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        dfs(0, nums, target, subset, 0);
        return res;
    }
    public void dfs(int i, int[] nums, int target, List<Integer> subset, int total){
        if (total == target) {
            this.res.add(new ArrayList<>(subset));
            return;
        }
        for (int j = i; j < nums.length; j++) {
            if (total + nums[j] > target) {
                return;
            }
            subset.add(nums[j]);
            dfs(j, nums, target, subset, total + nums[j]);
            subset.remove(subset.size() - 1);
        }
    }
}
