class Solution {
    public int[] getConcatenation(int[] nums) {
         int[] res = new int[nums.length * 2];
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