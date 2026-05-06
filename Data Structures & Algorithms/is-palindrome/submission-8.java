class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;

        // convert s to a array of characters
        char[] letters = s.toCharArray();

        // iterate until pointers cross each other
        while (l < r) {

            // keep skipping until reaches a letter 
            // stop when pointers cross each other 
            while (l < r && !Character.isLetterOrDigit(letters[l])){
                l++;
            }

            while (l < r && !Character.isLetterOrDigit(letters[r])){
                r--;
            }

            if (Character.toLowerCase(letters[l]) == Character.toLowerCase(letters[r])){
                l++;
                r--;
            }
            else {
                return false;
            }
        }
        return true;
    }
}