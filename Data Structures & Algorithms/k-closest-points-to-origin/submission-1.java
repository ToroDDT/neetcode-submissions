class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> min = new PriorityQueue<>(Comparator.comparing(a -> a[0]));
        for(int[] point : points) {
            int dist = (point[0] * point[0]) + (point[1] * point[1]);
            min.offer(new int[] {dist, point[0], point[1]});
        }
        int[][] res = new int[k][2];
        for(int i = 0; i < k; ++i) {
            int[] point = min.poll();
            res[i] = new int[] {point[1], point[2]};
        }
        return res;
    }
}
