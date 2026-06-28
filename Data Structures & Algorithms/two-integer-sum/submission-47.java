class Solution {
    public int[] twoSum(int[] nums, int target) {
        // intialize a list of pairs
        // the length of this list will be equal to length of nums
        // intizlise pair with zeros [0.0];
        int[][] pairs = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            pairs[i] = new int[] {i, nums[i]};
        }
        Arrays.sort(pairs, (a, b) -> Integer.compare(a[1], b[1]));
        int l = 0;
        int r = pairs.length - 1; 
        while (l < r) {
            int sum = pairs[l][1] + pairs[r][1];
            if (sum == target) {
                return new int[]{Math.min(pairs[l][0], pairs[r][0]), Math.max(pairs[l][0], pairs[r][0])};
            }
            else if (sum > target) {
                r--;
            }
            else {
                l++;
            }
        }
        return new int[] {1, 1};
    }
}
