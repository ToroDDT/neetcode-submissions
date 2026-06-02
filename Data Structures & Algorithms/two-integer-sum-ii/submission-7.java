class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // create mine left pointer
        int l = 0;
        // create right pointer
        int r = numbers.length - 1;
        while(l < r) {
            int res = numbers[l] + numbers[r];
            if (target == res) {
                return new int[] {l+1, r+ 1};
            }
            if (res < target) {
                l++;
            }
            else {
                r--;
            }
        }
        return new int[]{1,1};
    }
}
