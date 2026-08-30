class Solution {
    public int maxArea(int[] heights) {
        // start 
        int l = 0;
        // end 
        int r = heights.length - 1;
        // current res;
        int res = 0;
        while (l < r) {
            // get the width 
            int width = r - l;
            // get height
            int height = Math.min(heights[l], heights[r]);
            int area = width * height;
            res = Math.max(res, area);
            if (heights[l] < heights[r]) {
                l++;
            }
            else {
                r--;
            }
        }
        return res;
    }
}
