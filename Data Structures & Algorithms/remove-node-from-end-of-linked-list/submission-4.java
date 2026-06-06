/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
   public ListNode removeNthFromEnd(ListNode head, int n) {
    // 1. Reverse the list so we can count from the front
    ListNode list = reverse(head);
    
    // Edge Case: If we need to remove the very first node of the reversed list
    if (n == 1) {
        ListNode newReversedHead = list.next;
        return reverse(newReversedHead); // Reverse it back to original order
    }
    
    // 2. Use a pointer to find the (n-1)th node
    ListNode curr = list;
    int r = 1;
    while (r < n - 1 && curr != null) {
        curr = curr.next;
        r++;
    }
    
    // 3. Skip the Nth node
    if (curr != null && curr.next != null) {
        curr.next = curr.next.next;
    }
    
    // 4. Reverse it back to restore original direction
    return reverse(list);
}
 public ListNode reverse(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode newHead = head;
        if (head.next != null) {
            newHead = reverse(head.next);
            head.next.next = head;
        }
        head.next = null;
        return newHead;
    }
}
