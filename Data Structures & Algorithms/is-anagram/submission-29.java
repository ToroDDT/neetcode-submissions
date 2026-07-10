class Solution {
    public boolean isAnagram(String s, String t) {
        char[] w = s.toCharArray();
        char[] r = t.toCharArray();
        Arrays.sort(w);
        Arrays.sort(r);
        String wordOne = new String(w);
        String wordTwo = new String(r);
        return wordOne.equals(wordTwo);
    }
}
