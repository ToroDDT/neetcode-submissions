class Solution {
    public List<List<Integer>> res;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        res = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums, target, 0, 0, cur);
        return res;
    }
    public void backtrack(int[] nums, int target, int total, int i, List<Integer> cur) {
        if (total == target) {
            res.add(new ArrayList<>(cur));
            return;
        }
        for (int j = i; j < nums.length; j++) {
            if (total + nums[j] > target) {
                return;
            }
            cur.add(nums[j]);
            backtrack(nums, target, total + nums[j], j, cur);
            cur.remove(cur.size() - 1);
        }
    }
}
