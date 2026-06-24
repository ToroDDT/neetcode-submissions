class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        
        // Use <= so we check the case where l and r meet on the single remaining element
        while (l <= r) {
            int mid = l + (r - l) / 2;
            
            if (nums[mid] == target)  {
                return mid; // Target found!
            }
            else if (nums[mid] < target) {
                l = mid + 1; // Target is in the right half, discard left half
            }
            else {
                r = mid - 1; // Target is in the left half, discard right half
            }
        }
        
        return -1; // Target not found
    }
}
