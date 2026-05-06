public class Solution {
    public int[] twoSum(int[] nums, int target) {
        // what is the Goal? 
        // Start by subtracting target - num = value 
        Map<Integer, Integer> diff = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            diff.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++){
            int value = target - nums[i]; 
            if(diff.containsKey(value) && diff.get(value) != i) {
                return new int[]{i, diff.get(value)};
            }
        }

        return new int[]{};

    }
}