class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> set = new HashMap<>();
        for (String str : strs) {
            char[] word = str.toCharArray();
            Arrays.sort(word);
            if (set.containsKey(new String(word))) {
                set.get(new String(word)).add(str);
            }
            else {
                set.putIfAbsent(new String(word), new ArrayList<>(List.of(str)));
            }
        }
        return new ArrayList<>(set.values());
    }
}
