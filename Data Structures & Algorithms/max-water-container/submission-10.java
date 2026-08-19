class Solution {
    public int maxArea(int[] heights) {
        int res = 0;
        int l = 0;
        int r = heights.length - 1;
        while (l < r) {
            int width = r - l; 
            int height  = Math.min(heights[l], heights[r]);
            int area = width * height;
            res = Math.max(area, res);
            if (heights[l] <= heights[r]) {
                l++;
            }
            else {
                r--;
            }
        }
        return res;
    }
}
