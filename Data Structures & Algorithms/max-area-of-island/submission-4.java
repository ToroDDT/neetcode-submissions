class Solution {
    public static int[][] directions = {{0,1}, {1,0}, {-1, 0}, {0, -1}};
    public int maxAreaOfIsland(int[][] grid) {
        int rows = grid.length; int cols = grid[0].length;
        int area = 0;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == 1) {
                    area = Math.max(area, bfs(grid, r, c));
                }
            }
        }
        return area;
    }
    public int bfs(int[][] grid, int r, int c) {
        Queue<int[]> q = new LinkedList<>();
        grid[r][c] = 0;
        q.add(new int[] {r, c});
        int area = 1;
        while (!q.isEmpty()) {
            int[] node = q.poll();
            int row = node[0]; int col = node[1];
            for (int[] direction : directions) {
                int nr = row + direction[0]; int nc = col + direction[1];
                if (nr >= 0 && nc >= 0 && nr < grid.length && nc < grid[0].length && grid[nr][nc] == 1){
                    area = area + 1;
                    grid[nr][nc] = 0;
                    q.add(new int[] {nr, nc});
                }
            }
        }
        return area;
    }
}