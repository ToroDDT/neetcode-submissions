class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> min = new PriorityQueue<>();
        for (int stone : stones) {
            min.offer(-stone);
        }

        while (min.size() > 1) {
            int x = min.poll();
            int y = min.poll();
            if (y > x) {
                min.offer(x - y);
            }
        }

        min.offer(0);
        return Math.abs(min.peek());
    }
}
