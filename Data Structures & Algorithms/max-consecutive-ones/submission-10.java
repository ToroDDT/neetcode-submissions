class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        // assume longest sequence of 1's to be zero
        int res = 0;
        // current sequence length will be zero as well
        int cur = 0;
        for (int num : nums) {
            if (num == 1) {
                cur = cur + 1;
            }
            else if (num == 0) {
                res = Math.max(cur, res);
                cur = 0;
            }
        }
        return Math.max(res, cur);

    }
}