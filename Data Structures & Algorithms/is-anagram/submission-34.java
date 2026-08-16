class Solution {
    public boolean isAnagram(String s, String t) {
        char[] w  = s.toCharArray();
        char[] i = t.toCharArray();
        Arrays.sort(w);
        Arrays.sort(i);
        String b = new String(w);
        String n = new String(i);
        return b.equals(n);
    }
}
