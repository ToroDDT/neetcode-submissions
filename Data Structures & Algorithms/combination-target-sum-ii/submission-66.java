class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        res = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(0, candidates, target, 0, new ArrayList<>());
        return res;
    }
    public void dfs(int i, int[] candidates, int target, int total, List<Integer> subset) {
        if (total == target) {
            this.res.add(new ArrayList<>(subset));
            return;
        }
        if (i >= candidates.length || total > target) return;
        subset.add(candidates[i]);
        dfs(i + 1, candidates, target, candidates[i] + total, subset);
        subset.remove(subset.size() - 1);

        while( i + 1 < candidates.length && candidates[i] == candidates[i + 1]){
            i++;
        }
        dfs(i + 1, candidates, target, total, subset);
    }
}
