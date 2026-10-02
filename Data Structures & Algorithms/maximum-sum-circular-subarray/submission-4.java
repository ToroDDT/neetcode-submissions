class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int globMax = nums[0]; int globMin = nums[0]; int total = 0;
        int curMax = 0; int curMin = 0; 
        for (int num : nums) {
            curMax = Math.max(num, num + curMax);
            curMin = Math.min(num, num + curMin);
            globMax = Math.max(globMax, curMax);
            globMin = Math.min(curMin, globMin);
            total += num;
        }
        return globMax < 0 ? globMax : Math.max(total - globMin, globMax);
    }
}