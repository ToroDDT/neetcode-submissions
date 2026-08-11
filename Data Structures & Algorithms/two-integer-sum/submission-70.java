class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[][] pairs = new int[nums.length][2];
        for (int i = 0; i < pairs.length; i++) {
            pairs[i] = new int[] {nums[i], i};
        }
        Arrays.sort(pairs, (a, b) -> Integer.compare(a[0], b[0]));
        int l = 0;
        int r = pairs.length - 1;
        while (l < r) {
            int sum = pairs[l][0] + pairs[r][0];
            if (sum == target) {
                return new int[] {Math.min(pairs[l][1], pairs[r][1]), Math.max(pairs[l][1], pairs[r][1])};
            }
            else if(sum > target) {
                r--;
            }
            else {
                l++;
            }
        }
        return new int[] {1,0};
    }
}
