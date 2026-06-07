class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy; // Fix 2: Tracker node to build the chain
        int carry = 0;
        
        while (l1 != null || l2 != null || carry != 0) {
            int v1 = (l1 != null) ? l1.val : 0;
            int v2 = (l2 != null) ? l2.val : 0;
            
            int sum = v1 + v2 + carry; // Fix 1: Include the carry in the sum!
            
            int digit = sum % 10;
            carry = sum / 10;
            
            curr.next = new ListNode(digit); // Link it to the end of our growing chain
            curr = curr.next;                // Move our tracking pointer forward
            
            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }
        return dummy.next;
    }
}
