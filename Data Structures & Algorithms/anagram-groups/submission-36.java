class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> group = new HashMap<>();
        for (String str : strs) {
            char[] word = str.toCharArray();
            Arrays.sort(word);
            String sortedS = new String(word);
            group.putIfAbsent(sortedS, new ArrayList<>());
            group.get(sortedS).add(str);
        }
        return new ArrayList<>(group.values());
    }
}
