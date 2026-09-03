class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String word : strs) {
            char[] w = word.toCharArray();
            Arrays.sort(w);
            String s = new String(w);
            map.computeIfAbsent(s, k -> new ArrayList<>()).add(word);
        }
        return new ArrayList<>(map.values());
    }
}
