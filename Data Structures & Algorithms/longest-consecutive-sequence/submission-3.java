
class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);

        // A single element is a sequence of 1
        int longest = 1;
        int cur = 1; 

        for (int i = 1; i < nums.length; i++) {
            // Skip duplicates, they don't break the streak
            if (nums[i] == nums[i - 1]) {
                continue; 
            }
            
            // If it's consecutive, increment current streak
            if (nums[i] == nums[i - 1] + 1) {
                cur++;
            } else {
                // Streak broken! Save the maximum and reset
                longest = Math.max(longest, cur);
                cur = 1;
            }
        }
        
        // One final check in case the longest streak goes to the end of the array
        return Math.max(longest, cur);
    }
}