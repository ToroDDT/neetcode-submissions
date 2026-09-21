class Solution {
    public int maxSubArray(int[] nums) {
        int curMax = 0; int globalMax = nums[0];
        for (int num : nums) {
            if (curMax < 0) {
                curMax = 0;
            }
            curMax += num;

            globalMax = Math.max(curMax, globalMax);
        }
        return globalMax;
    }
}
