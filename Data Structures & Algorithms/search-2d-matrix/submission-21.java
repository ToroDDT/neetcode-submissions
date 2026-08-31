class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low = 0;
        int high = matrix.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int length = matrix[mid].length - 1;
            if (matrix[mid][0] > target) {
                high = mid - 1;
            }
            else if (matrix[mid][length] < target) {
                low = mid + 1;
            }
            else {
                int l = 0;
                int h = matrix[mid].length - 1;
                while (l <= h) {
                    int m = l + (h - l) / 2;
                    if (matrix[mid][m] == target) {
                        return true;
                    }
                    else if (matrix[mid][m] < target) {
                        l = m + 1;
                    }
                    else {
                        h = m - 1;
                    }
                }
                return false;
            }
        }
        return false;
    }
}
