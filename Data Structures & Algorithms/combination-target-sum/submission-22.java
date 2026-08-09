class Solution {
    public List<List<Integer>> res;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        res = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(0, 0, target, cur, nums);
        return res;
    }
    public void backtrack(int i, int total, int target, List<Integer> cur, int[] nums) {
        if (total == target) {
            res.add(new ArrayList<>(cur));
            return;
        }
        for (int j = i; j < nums.length; j++) {
            if (nums[j] + total > target) {
                return;
            }
            cur.add(nums[j]);
            backtrack(j, total + nums[j], target, cur, nums);
            cur.remove(cur.size() - 1);
        }
    }
}
