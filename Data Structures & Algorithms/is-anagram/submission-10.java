class Solution {
    public boolean isAnagram(String s, String t) {
        char[] wordOne = s.toCharArray();
        char[] wordTwo = t.toCharArray();
        Arrays.sort(wordOne);
        Arrays.sort(wordTwo);
        String c = new String(wordOne);
        String b = new String(wordTwo);

        if (b.equals(c)){
            return true;
        }
        return false;
    }
}
