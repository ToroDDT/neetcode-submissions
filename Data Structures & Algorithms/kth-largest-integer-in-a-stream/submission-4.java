class KthLargest {

    public PriorityQueue<Integer> min;

    public int v;

    public KthLargest(int k, int[] nums) {
        min = new PriorityQueue<>();
        v = k;
        for (int num : nums) {
            min.offer(num);
            if (min.size() > k) {
                min.poll();
            }
        }
    }

    public int add(int val) {
        min.offer(val);
        if (min.size() > v) {
            min.poll();
        }
        return min.peek();
    }
}
