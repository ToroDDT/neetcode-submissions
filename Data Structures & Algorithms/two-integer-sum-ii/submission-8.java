class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // why is the two pointer method the best here? 
        // the two pointer method is good here since I need to find two numbers 
        // if the guess is higher then target
        // then i know if i move the left pointer to the left 
        // it will only increase
        // so i need to move the right pointer to the left


        // start at the beggining 
        int l = 0;
        /// start at the end
        int r = numbers.length - 1;
        // iterate until the left and right pointer cross if they cross taht means i  coulddn find the anser
        while (l < r) {
            // get the guess
            int guess = numbers[l] + numbers[r];
            if (guess == target) {
                return new int [] {l + 1, r + 1};
            }
            if (guess < target) {
                l++;
            }
            else {
                r--;
            }
        }
        return new int[]{1, 1};
    }
}
