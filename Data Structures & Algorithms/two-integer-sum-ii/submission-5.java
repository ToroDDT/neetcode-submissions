class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // need to get our left pointer 
        int l = 0;
        // need to get our right pointer
        int r = numbers.length - 1;


        while (l < r) {
            // add left and right values and compare to target
            int value = numbers[l] + numbers[r];
            if (value == target) {
                return new int[] {l + 1, r + 1};
            }

            if (value > target) {
                r--;
            }

            else {
                l++;
            }
        }
        return new int[]{};
    }
}
