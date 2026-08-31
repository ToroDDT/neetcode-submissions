class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for (int pile : piles) {
            max = Math.max(max, pile);
        }
        int low = 1;
        int high = max;
        int res = max;
        while (low <= high) {
            int pace = low +(high - low) / 2;
            int time = 0; 
            for (int pile : piles) {
                time += (int) Math.ceil((double) pile / pace);
            }
            if (time <= h) {
                res = Math.min(res, pace);
                high = pace - 1;
            }
            else {
                low = pace + 1;
            }
        }
        return res;
    }
}
