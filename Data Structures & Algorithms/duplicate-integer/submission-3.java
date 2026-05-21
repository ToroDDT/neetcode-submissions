class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> numbers = new HashMap<>();
        for (int num : nums) {
            if (numbers.get(num) != null) {
                return true;
            }
            else {
                numbers.put(num, num);
            }
        }
        return false;
    }
}