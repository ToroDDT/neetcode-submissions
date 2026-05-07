class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length - 1;

        int result = 0;

        while (l < r) {
            int height = Math.min(heights[l], heights[r]);
            int width = r - l;
            int amount = height * width;
            result = Math.max(result, amount);
            if (heights[l] > heights[r]){
                r--;
            }
            else {
                l++;
            }
        }
        return result;
    }
}
