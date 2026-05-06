
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();
        for (String word : strs){
            char[] letters = word.toCharArray();
            Arrays.sort(letters);
            String key = String.valueOf(letters);

            anagrams.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }
        return new ArrayList<>(anagrams.values());

    }
}