class Solution {
    public boolean isPalindrome(String s) {
        // Convert to array of characters
        char[] sentence = s.toCharArray(); 
        
        // Create two pointers
        int l = 0;
        int r = sentence.length - 1;
        
        while (l < r) {
            // Added "l < r" to prevent walking off the bounds of the array
            while(l < r && !Character.isLetterOrDigit(sentence[l])) {
                l++;
            }
            // Added "l < r" here as well
            while(l < r && !Character.isLetterOrDigit(sentence[r])){
                r--;
            }

            // Fixed the parenthesis syntax error
            if (Character.toLowerCase(sentence[l]) != Character.toLowerCase(sentence[r])){
                return false;
            }
            else {
                r--;
                l++;
            }
        }
        return true;
    }
}