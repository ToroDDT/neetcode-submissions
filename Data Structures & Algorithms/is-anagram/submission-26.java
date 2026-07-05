class Solution {
    public boolean isAnagram(String s, String t) {
        char[] wordOne = s.toCharArray();
        char[] wordTwo = t.toCharArray();
        Arrays.sort(wordOne);
        Arrays.sort(wordTwo);
        String b = new String(wordOne);
        String u = new String(wordTwo);
        return b.equals(u);
    }
}
