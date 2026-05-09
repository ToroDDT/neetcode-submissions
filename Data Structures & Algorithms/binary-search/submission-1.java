class Solution {
  public int search(int[] nums, int target) {
    int l = 0;
    int r = nums.length - 1;
    while (l <= r) {
      int midPoint = l + (r - l) / 2;
      if (nums[midPoint] == target) {
        return midPoint;
      }
      else if (nums[midPoint] < target){
        l = midPoint + 1;
      }
      else {
        r = midPoint - 1;
      }
    }
    return -1;
  }
}