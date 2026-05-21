class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Use String as the key, not char[]
        Map<String, List<String>> anagramList = new HashMap<>();
        
        for (String anagram : strs) {
            char[] word = anagram.toCharArray();
            Arrays.sort(word);
            String sortedKey = new String(word); 
            
            anagramList.computeIfAbsent(sortedKey, k -> new ArrayList<>()).add(anagram);
        }
        
        return new ArrayList<>(anagramList.values());
    }
}
