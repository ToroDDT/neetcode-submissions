
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0; 
        int maxLength = 0;
        // Use a HashSet to keep track of unique characters in the current window
        HashSet<Character> set = new HashSet<>();
        
        // 'r' acts as the right boundary of our window
        for (int r = 0; r < s.length(); r++) {
            // If we hit a duplicate, shrink the window from the left
            while (set.contains(s.charAt(r))) {
                set.remove(s.charAt(l));
                l++;
            }
            
            // Add the current character to the window
            set.add(s.charAt(r));
            
            // Update the maximum length found so far
            maxLength = Math.max(maxLength, r - l + 1);
        }
        
        return maxLength;
    }
}