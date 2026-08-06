class Solution {

    public List<List<Integer>> res;

    public List<List<Integer>> subsets(int[] nums) {
        res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        dfs(0, nums, subset);
        return res;
    }
    public void dfs(int i, int[] nums, List<Integer> subset) {
        if (i == nums.length) {
            res.add(new ArrayList<>(subset));
            return;
        }
        // include this number and finds all subsets that include this number
        subset.add(nums[i]);
        dfs(i + 1, nums, subset);

        //exclude this number and finds all subsets that exclude this number
        subset.remove(subset.size() - 1);
        dfs(i + 1, nums, subset);
    }

}
