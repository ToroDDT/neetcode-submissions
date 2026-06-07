class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // No need to reverse! l1 and l2 already start at the ones place.
        ListNode first = l1;
        ListNode second = l2;
        
        ListNode dummy = new ListNode(0); 
        ListNode currNode = dummy;
        int carry = 0;
        
        while (first != null || second != null || carry != 0) {
            int sum = carry; 
            
            if (first != null) {
                sum += first.val;
                first = first.next;
            }
            if (second != null) {
                sum += second.val;
                second = second.next;
            }
            
            carry = sum / 10; 
            int digit = sum % 10; 
            
            currNode.next = new ListNode(digit); 
            currNode = currNode.next; 
        }
        
        // Simply return the head of the newly built list
        return dummy.next;
    }
    
    // You can completely delete the reverseList method now!
}