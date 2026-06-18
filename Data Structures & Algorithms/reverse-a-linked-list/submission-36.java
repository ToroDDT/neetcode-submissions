class Solution {
    public ListNode reverseList(ListNode head) {
        // Base case: if the list is empty or we've reached the last node
        if (head == null || head.next == null) {
            return head;
        }

        // Recursively reverse the rest of the list
        ListNode newHead = reverseList(head.next);

        // Rearrange the pointers:
        // Make the next node point back to the current node
        head.next.next = head;
        // Disconnect the current node's forward link to prevent cycles
        head.next = null;

        // Return the new head of the reversed list
        return newHead;
    }
}
