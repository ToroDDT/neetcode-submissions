class Solution {
    public List<List<Integer>> res;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        res = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates, target, 0, 0, cur);
        return res;
    }
    public void backtrack(int[] candidates, int target, int total, int i, List<Integer> cur){
        if (total == target) {
            res.add(new ArrayList<>(cur));
            return;
        }
        if (i >= candidates.length){
            return;
        }
        if (total + candidates[i] > target) {
            return;
        }
        cur.add(candidates[i]);
        backtrack(candidates, target, candidates[i] + total, i + 1, cur);
        cur.remove(cur.size() - 1);
        while (i + 1 < candidates.length && candidates[i] == candidates[i + 1]) {
            i++;
        }
        backtrack(candidates, target, total, i + 1, cur);
    }
}
