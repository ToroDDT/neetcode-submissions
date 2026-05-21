class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> complement = new HashMap<>();
        for (int i = 0; i <= nums.length -1; i++) {
            int res = target - nums[i];
            if (complement.get(res) != null) {
                return new int [] {complement.get(res), i};
            }
            else {
                complement.put(nums[i], i);
            }
        }
        return new int[]{0};
    }
}
