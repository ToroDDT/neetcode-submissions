class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<int[]> min = new PriorityQueue<>(Comparator.comparing(a -> a[0]));
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            min.offer(new int [] {entry.getValue(), entry.getKey()});
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
