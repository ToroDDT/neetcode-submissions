class Solution {
    public int characterReplacement(String s, int k) {
        int res = 0;
        HashSet<Character> charSet = new HashSet<>();
        char[] characters = s.toCharArray();
        for (char c : characters) {
            charSet.add(c);
        }
        for (char a : charSet) {
            int count = 0; int l = 0;
            for (int r = 0; r < characters.length; r++) {
                if (s.charAt(r) == a) {
                    count++;
                }

                while ((r - l + 1) - count > k) {
                    if (s.charAt(l) == a) {
                        count--;
                    }

                    l++;
                }
                res = Math.max(res, r - l + 1);
            }
        }
        return res;
    }
}
