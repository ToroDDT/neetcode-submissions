class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> set = new HashMap<>();
        for (int num : nums) {
            set.put(num, set.getOrDefault(num, 0) + 1);
        }
        // return the values of the hasMap
        PriorityQueue<int[]> min = new PriorityQueue<>((a , b) -> a[0] - b[0]);
        for (Map.Entry<Integer, Integer> entry : set.entrySet()) {
            min.offer(new int[] {entry.getValue(), entry.getKey()});
            if (min.size() > k) {
                min.poll();
            }
        }
        int[] res = new int[k];
        for (int i  = 0; i < k; i++) {
            res[i] = min.poll()[1];
        }
        return res;
    }
}
