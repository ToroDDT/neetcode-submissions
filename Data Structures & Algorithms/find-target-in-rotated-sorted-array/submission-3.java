class Solution {
    public int search(int[] nums, int target) {
        // I need to figure out what part of the array that I am in 
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int m = l  + (r - l) / 2;
            if (nums[m] == target) {
                return m;
            }
            // Left side is sorted
            if (nums[l] <= nums[m]) {
                if (nums[l] <= target && target < nums[m]) {
                    r = m - 1;
                } else {
                    l = m + 1;
                }
            }
            // Right side must be sorted
            else {
                if (nums[m] < target && target <= nums[r]) {
                    l = m + 1;
                } else {
                    r = m - 1;
                }
            }
        }
        return -1;
    }
}
