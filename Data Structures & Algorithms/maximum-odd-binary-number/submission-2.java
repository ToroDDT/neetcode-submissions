class Solution {
    public String maximumOddBinaryNumber(String s) {
        int ones = 0;
        int n = s.length();
        
        // Count the number of '1's
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                ones++;
            }
        }
        
        StringBuilder res = new StringBuilder();
        
        // 1. Put all remaining '1's at the front (except the 1 saved for the end)
        for (int i = 0; i < ones - 1; i++) {
            res.append('1');
        }
        
        // 2. Put all '0's in the middle
        int zeros = n - ones;
        for (int i = 0; i < zeros; i++) {
            res.append('0');
        }
        
        // 3. Put the mandatory '1' at the very end to make it odd
        res.append('1');
        
        return res.toString();
    }
}