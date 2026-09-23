class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combine(int n, int k) {
        res = new ArrayList<>();
        dfs(1, n, k, new ArrayList<>());
        return res;
    }
    public void dfs (int i, int n, int k, List<Integer> subset) {
        if (subset.size() == k) {
            this.res.add(new ArrayList<>(subset));
            return;
        }
        if (i > n) return;
        subset.add(i);
        dfs(i + 1,n, k, subset);
        subset.remove(subset.size() - 1);
        dfs(i + 1,n, k, subset);
    }
}
// what is the base case situation? 
// if subset size == k return subset