class Solution {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int cur = 0;
        for (int num : nums) {
            if (cur < 0) {
                cur = 0;
            }
            cur += num;
            res = Math.max(cur, res);
        }
        return res;
    }
}
