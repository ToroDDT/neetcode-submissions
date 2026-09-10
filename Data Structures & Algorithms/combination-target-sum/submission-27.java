class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        res = new ArrayList<>();
        Arrays.sort(nums);
        List<Integer> combo = new ArrayList<>();
        dfs(0, nums, target, 0, combo);
        return res;
    }
    public void dfs(int i, int[] nums, int target, int total, List<Integer> combo) {
        if (total == target) {
            this.res.add(new ArrayList<>(combo));
            return;
        }
        for(int j = i; j < nums.length; j++) {
            if (nums[j] + total > target) {
                return;
            }
            combo.add(nums[j]);
            dfs(j, nums, target, total + nums[j], combo);
            combo.remove(combo.size() - 1);
        }
    }
}
