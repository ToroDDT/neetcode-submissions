class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            String b = Integer.toBinaryString(i);
            int count = 0;
            for (int j = 0; j < b.length(); j++) {
                if (b.charAt(j) == '1') {
                    count++;
                }
            }
            res[i] = count;
        }
        return res;
    }
}
