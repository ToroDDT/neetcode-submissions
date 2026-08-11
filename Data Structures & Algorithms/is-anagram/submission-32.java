class Solution {
    public boolean isAnagram(String s, String t) {
        char[] w = s.toCharArray();
        char[] v = t.toCharArray();
        Arrays.sort(w);
        Arrays.sort(v);
        String p = new String(w);
        String b = new String(v);
        if (b.equals(p)) {
            return true; 
        }
        return false;
    }
}
