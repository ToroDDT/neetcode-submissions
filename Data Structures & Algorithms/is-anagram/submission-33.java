class Solution {
    public boolean isAnagram(String s, String t) {
        char[] r = s.toCharArray();
        char[] x = t.toCharArray();
        Arrays.sort(r);
        Arrays.sort(x);
        String w = new String(r);
        String b = new String(x);
        return b.equals(w);
    }
}
