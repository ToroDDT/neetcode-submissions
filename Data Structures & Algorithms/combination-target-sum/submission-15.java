class Solution {
    List<List<Integer>> res;

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        // store the res;
        res = new ArrayList<>();
        // combinaiton
        List<Integer> cur = new ArrayList<>();
        // sort numbers, optimzation
        Arrays.sort(nums);
        dfs(0, 0, target, cur, nums);
        return res;
    }
    public void dfs(int i, int total, int target, List<Integer> cur, int[] nums){
        // if our total equals target add the combination to res;
        if (total == target) {
            res.add(new ArrayList<>(cur));
            return;
        }
        for (int j = i; j < nums.length; j++) {
            if (total + nums[j] > target) {
                return;
            }
            cur.add(nums[j]);
            dfs(j, total + nums[j], target, cur, nums);
            cur.remove(cur.size() - 1);
        }
    }
}
