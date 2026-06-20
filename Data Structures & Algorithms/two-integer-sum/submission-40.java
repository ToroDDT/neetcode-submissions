
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // 1. Create a 2D array to store [value, original_index]
        int[][] list = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            list[i] = new int[] {nums[i], i};
        }
        
        // Fix: Use Arrays.sort instead of list.sort
        Arrays.sort(list, (a, b) -> Integer.compare(a[0], b[0]));
        
        int l = 0;
        int r = nums.length - 1;
        
        while (l < r) {
            // Fix: Access 'list' instead of 'nums'
            int sum = list[l][0] + list[r][0];
            
            if (sum == target) {
                // Fix: Access 'list' instead of 'nums'
                return new int[] {
                    Math.min(list[l][1], list[r][1]), 
                    Math.max(list[l][1], list[r][1])
                };
            }
            else if (sum > target) {
                r--;
            }
            else {
                l++;
            }
        }
        
        return new int[] {-1, -1};
    }
}