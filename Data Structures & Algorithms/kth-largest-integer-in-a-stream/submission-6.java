class KthLargest {

    public PriorityQueue<Integer> min;

    public int k;

    public KthLargest(int k, int[] nums) {

        min = new PriorityQueue<>();
        this.k = k;

        for (int num : nums) {
            min.offer(num);

            if (min.size() > k) {
                min.poll();
            }
        }
    }
    
    public int add(int val) {
        min.offer(val);
        if (min.size() > this.k) {
            min.poll();
        }

        return min.peek();
    }

}
