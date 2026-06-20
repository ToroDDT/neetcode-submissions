class Solution {
    public boolean hasDuplicate(int[] nums) {
        // the goal is to check if there is a duplicate value
        // 
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}