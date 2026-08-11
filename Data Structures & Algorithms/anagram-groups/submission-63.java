class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> res = new HashMap<>();
        for (String str : strs) {
            char[] characters = str.toCharArray();
            Arrays.sort(characters);
            String w = new String(characters);
            res.computeIfAbsent(w, k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(res.values());
    }
}
