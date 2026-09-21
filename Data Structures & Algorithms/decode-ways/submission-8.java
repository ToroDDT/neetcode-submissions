class Solution {
    public HashMap<Integer, Integer> dp = new HashMap<>();

    public int numDecodings(String s) {
        this.dp.put(s.length(), 1);
        return dfs(0, s);
    }
    public int dfs(int i, String s) {
        if (this.dp.containsKey(i)) {
            return dp.get(i);
        }
        if (s.charAt(i) == '0') return 0; 
        int res = 0;
        res += dfs(i + 1, s);
        if (i + 1 < s.length() && (s.charAt(i) == '1' ||
           s.charAt(i) == '2' && s.charAt(i + 1) < '7')) {
            res += dfs(i + 2, s);
            }
        dp.put(i, res);
        return res;
    }
}
