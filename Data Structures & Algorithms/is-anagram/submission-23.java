class Solution {
    public boolean isAnagram(String s, String t) {
        char[] wordOne = s.toCharArray();
        char[] wordTwo= t.toCharArray();
        Arrays.sort(wordOne);
        Arrays.sort(wordTwo);
        String w = new String(wordOne);
        String q = new String(wordTwo);
        return w.equals(q);
    }
}