class Solution {
    public int majorityElement(int[] nums) {
        if (nums.length == 0 || nums == null) {
            return 0;
        }
        if (nums.length == 1){
            return nums[0];
        }
        Arrays.sort(nums);
        int l = 0;
        int r = nums.length - 1;
        int mid = l + (r - l) / 2;
        return nums[mid];
    }
}