class Solution {
    public boolean hasDuplicate(int[] nums) {
        // The way in which i can solve this problem is through the use of a HashSet
        // The reason is becuase i can not add duplicates to hashset
        // I can track values that have been alreaqdy seen
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