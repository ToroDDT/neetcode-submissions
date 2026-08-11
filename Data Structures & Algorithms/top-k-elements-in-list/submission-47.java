class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Integer[]> min = new PriorityQueue<>(Comparator.comparing(a -> a[0]));
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            min.offer(new Integer[] {entry.getValue(), entry.getKey()});
            if (min.size() > k) {
                min.poll();
            }
        }
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = min.poll()[1];
        }
        return res;
    }
}
