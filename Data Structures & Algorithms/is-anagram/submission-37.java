class Solution {
    public boolean isAnagram(String s, String t) {
        char[] w = s.toCharArray();
        char[] r = t.toCharArray();
        Arrays.sort(w);
        Arrays.sort(r);
        String n = new String(w);
        String b = new String(r);
        return b.equals(n);
    }
}
