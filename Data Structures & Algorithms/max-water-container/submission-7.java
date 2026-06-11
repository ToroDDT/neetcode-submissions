class Solution {
    public int maxArea(int[] heights) {
        // height times width;
        int l = 0;
        int r = heights.length - 1;
        int res = 0;
        while (l < r) {
            int width = r - l;
            int height = Math.min(heights[l], heights[r]);
            int currentMax = width * height;
            res = Math.max(currentMax, res);
            if (l < r && heights[l] < heights[r]) {
                l++;
            }
            else if (l < r && heights[r] < heights[l]) {
                r--;
            }
            else {
                l++;
            }
        }
        return res;
    }
}
