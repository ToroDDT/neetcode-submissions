class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        // create an array with the length of daily temps
        // they all start with zero 
        // since base case no days after were hotter
        int[] res = new int[temperatures.length];
        // the pairs are going to store the day and temperature
        Stack<Integer[]> stack = new Stack<>();
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && stack.peek()[1] < temperatures[i]){
                Integer[] pair = stack.pop();
                // stores the amount of days that have past 
                res[pair[0]] = i - pair[0];
            }
            stack.push(new Integer[] {i, temperatures[i]});
        }
        return res;
    }
}
