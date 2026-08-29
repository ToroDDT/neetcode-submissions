class Solution {
    public boolean isAnagram(String s, String t) {
        char[] w = s.toCharArray();
        char[] n = t.toCharArray();
        Arrays.sort(w);
        Arrays.sort(n);
        String st = new String(w);
        String rt = new String(n);
        return st.equals(rt);
    }
}
