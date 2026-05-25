class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int longest = 1;
        int cur = 1;

        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                continue; 
            }
            if (nums[i] == nums[i - 1] + 1){
                cur++;
            }
            else {
                longest = Math.max(cur, longest);
                cur = 1;
            }
        }
        return Math.max(cur, longest);
    }
}
