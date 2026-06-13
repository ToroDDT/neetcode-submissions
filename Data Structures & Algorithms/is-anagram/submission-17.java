class Solution {
    public boolean isAnagram(String s, String t) {
        char[] wordOne = s.toCharArray();
        char[] wordTwo = t.toCharArray();
        Arrays.sort(wordOne);
        Arrays.sort(wordTwo);
        String newString = new String(wordOne);
        String newStringTwo = new String(wordTwo);
        return newString.equals(newStringTwo);
    }
}
