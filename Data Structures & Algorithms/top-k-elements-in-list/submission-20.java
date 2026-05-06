
public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Store the number and the amount of times it occurs. 
        // We use a HashMap because we can associate a number (key) with its frequency (value).
        Map<Integer, Integer> numbers = new HashMap<>();
        for (int number : nums) { // Changed Integer to int
            numbers.put(number, numbers.getOrDefault(number, 0) + 1); 
        }

        // This list will store the pairs.
        // First element in the pair (index 0) is the frequency (how many times it was seen).
        // Second element (index 1) is the actual number.
        List<int[]> pairs = new ArrayList<>();

        // entrySet() returns a Set of Map entries (key-value pairs) we can loop through.
        for (Map.Entry<Integer, Integer> entry : numbers.entrySet()) {
            pairs.add(new int[] {entry.getValue(), entry.getKey()});
        }

        // Sort the pairs list in descending order based on the frequency (index 0).
        pairs.sort((a, b) -> b[0] - a[0]);

        // Create the final int[] array of size k to return
        int[] res = new int[k]; 
        for (int i = 0; i < k; i++) {
            res[i] = pairs.get(i)[1]; // Grab the actual number (index 1 of the pair)
        }
        
        return res; // Return the array
    }
}