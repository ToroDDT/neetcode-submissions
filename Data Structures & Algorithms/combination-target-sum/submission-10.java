class Solution {
    public List<List<Integer>> res;

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        res = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        // sort the array to optimize whether to add or stop;
        Arrays.sort(nums);
        dfs(nums, new ArrayList<>(), 0, target, res, 0);
        return res;
    }
    public void dfs (int[] nums, List<Integer> cur, int total, int target, List<List<Integer>> res, int i) {
        if (total == target) {
            res.add(new ArrayList<>(cur));
        }
        for (int j = i; j < nums.length; j++) {
            if (nums[j] + total > target ) {
                return;
            }
            cur.add(nums[j]);
            dfs(nums, cur, total + nums[j], target, res, j);
            cur.remove(cur.size() - 1);
        }
    }
}
