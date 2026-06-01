public class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        // Create a result list filled with zeros
        int[] res = new int[temperatures.length];
        // create a stack to store pairs
        // a pair will look like pair [temp, index]
        Stack<int[]> stack = new Stack<>(); // pair: [temp, index]
        // iterate over the temperature list
        for (int i = 0; i < temperatures.length; i++) {
            int t = temperatures[i];
            while (!stack.isEmpty() && t > stack.peek()[0]) {
                int[] pair = stack.pop();
                res[pair[1]] = i - pair[1];
            }
            stack.push(new int[]{t, i});
        }
        return res;
    }
}