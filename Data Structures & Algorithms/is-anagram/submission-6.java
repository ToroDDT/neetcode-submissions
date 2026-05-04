class Solution {
    public boolean isAnagram(String s, String t) {
        var word1 = s.toCharArray();
        var word2 = t.toCharArray();
        Arrays.sort(word1);
        Arrays.sort(word2);
        return Arrays.equals(word1, word2);
    }
}
