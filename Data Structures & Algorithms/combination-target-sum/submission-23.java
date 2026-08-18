class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        res = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        Arrays.sort(nums);
        dfs(nums, target, cur, 0, 0);
        return res;
    }
    public void dfs(int[] nums, int target, List<Integer> cur, int j, int sum) {
        if (sum == target) {
            this.res.add(new ArrayList<>(cur));
            return;
        }
        for (int i = j; i < nums.length; i++) {
            if (nums[i] + sum > target) {
                break;
            }
            cur.add(nums[i]);
            dfs(nums, target, cur, i, nums[i] + sum);
            cur.remove(cur.size() - 1);
        }
    }
}
