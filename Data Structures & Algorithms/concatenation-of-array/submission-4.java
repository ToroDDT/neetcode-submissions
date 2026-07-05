class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] res = new int[2 * nums.length];
        int index = 0;
        for (int num : nums) {
            res[index] = num;
            index++;
        }
        for (int num : nums) {
            res[index] = num;
            index++;
        }
        return res;
    }
}