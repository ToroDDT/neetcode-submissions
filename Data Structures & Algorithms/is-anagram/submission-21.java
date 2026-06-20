class Solution {
    public boolean isAnagram(String s, String t) {
        // the problem, the the ordering 
        char[] wordOne = s.toCharArray();
        char[] wordTwo = t.toCharArray();
        Arrays.sort(wordOne);
        Arrays.sort(wordTwo);
        String word1 = new String(wordOne);
        String word2 = new String(wordTwo);
        return word1.equals(word2);
    }
}
