class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int[] numbers : matrix){
            int l = 0;
            int r = numbers.length - 1;
            while (l <= r) {
                int midPoint = l + (r -l ) / 2;
                if (numbers[midPoint] == target) {
                    return true;
                }
                else if (numbers[midPoint] < target){
                    l = midPoint + 1;
                }
                else {
                    r = midPoint - 1;
                }
            }
        }
        return false;
    }
}
