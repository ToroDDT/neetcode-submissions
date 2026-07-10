class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> group = new HashMap<>();
        for (String s : strs) {
            char[] characters = s.toCharArray();
            Arrays.sort(characters);
            String word = new String(characters);
            group.computeIfAbsent(word, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(group.values());
    }
}