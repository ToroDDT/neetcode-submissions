class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        int increase = 1;
        int cur = 1;
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 < n && nums[i] < nums[i + 1]) {
                cur++;
            }
            else {
                increase = Math.max(cur, increase);
                cur = 1;
            }
        }
        int decrease = 1;
        int current = 1;
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 < n && nums[i] > nums[i + 1]) {
                current++;
            }
            else {
                decrease = Math.max(current, decrease);
                current = 1;
            }
        }
        return Math.max(decrease, increase);
    }
}