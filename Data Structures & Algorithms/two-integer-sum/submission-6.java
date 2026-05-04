public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // 1. Check if the complement exists in the map already
            if (map.containsKey(complement)) {
                // Since 'complement' was put in earlier, map.get() is the smaller index
                return new int[] { map.get(complement), i };
            }
            
            // 2. If not found, put the current number and its index in the map
            map.put(nums[i], i);
        }
        
        return new int[0];
    }
}