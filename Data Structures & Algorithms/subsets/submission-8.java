class Solution {
    public List<List<Integer>> subsets(int[] nums) {
         List<List<Integer>> res = new ArrayList<>();
         List<Integer> subset = new ArrayList<>();
         backtrack(nums, subset, res, 0);
         return res;
    }

    private void backtrack(int[] nums, List<Integer> subset, List<List<Integer>> res, int i) {
        if (i >= nums.length) {
            res.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[i]);
        backtrack(nums, subset, res, i + 1);
        subset.remove(subset.size() - 1);
        backtrack(nums, subset, res, i + 1);
    }
}
