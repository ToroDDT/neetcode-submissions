class Solution {
    public List<List<Integer>> res;
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        res = new ArrayList<>();
        Arrays.sort(candidates);
        List<Integer> cur = new ArrayList<>();
        dfs(0, 0, target, candidates, cur);
        return res;
    }
    public void dfs(int i, int total, int target, int[] candidates, List<Integer> cur) {
        if (total == target) {
            this.res.add(new ArrayList<>(cur));
            return;
        }

        if (total > target || i == candidates.length) {
            return;
        }
        cur.add(candidates[i]);
        dfs(i + 1, total + candidates[i], target, candidates, cur);
        cur.remove(cur.size() - 1);
        while (i + 1 < candidates.length && candidates[i] == candidates[i + 1]){
            i++;
        }
        dfs(i + 1, total, target, candidates, cur);
    }
}
