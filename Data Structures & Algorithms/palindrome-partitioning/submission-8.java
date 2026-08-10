class Solution {
    public List<List<String>> res;
    public List<List<String>> partition(String s) {
        List<String> part = new ArrayList<>();
        res = new ArrayList<>();
        dfs(s, part, 0);
        return res;
    }
    public void dfs(String s, List<String> part, int i) {
        if (i >= s.length()) {
            res.add(new ArrayList<>(part));
            return;
        }
        for (int j = i; j < s.length(); j++) {
            if (isPalis(s, i, j)){
                part.add(s.substring(i, j + 1));
                dfs(s, part, j + 1);
                part.remove(part.size() - 1);
            }
        }

    }
    public boolean isPalis(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l ++;
            r --;
        }
        return true;
    }
}
