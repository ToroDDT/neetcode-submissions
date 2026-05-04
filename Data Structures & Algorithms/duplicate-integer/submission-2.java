class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> values = new HashMap<>();

        for (int n : nums){
            if (values.containsKey(n)){
                return true;
            }
            else {
                values.put(n, n);
            }
        }
        return false;
    }
}