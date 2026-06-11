class Solution {
    public ListNode reverseList(ListNode head) {
        // Base case: if list is empty, or we are at the very last node
        if (head == null || head.next == null) {
            return head; 
        }
        
        // Drill down to the end. newHead will catch and hold node 3 (the new tail/old head)
        ListNode newHead = reverseList(head.next);
        
        // Reversing the pointers on the way back up
        head.next.next = head;
        head.next = null;
        
        // Pass the new head all the way back up to the original caller
        return newHead;
    }
}
