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
        if (head == null) {
            return head;
        }
        
        // 1. Turn "Nth from end" into "Nth from front" by reversing
        ListNode reversedList = reverseList(head);
        
        // Edge Case: If we need to remove the very first node of our reversed list (n == 1)
        if (n == 1) {
            ListNode newList = reversedList.next;
            return reverseList(newList);
        }
        
        // 2. Move a pointer to the node RIGHT BEFORE the one we want to delete
        ListNode curr = reversedList;
        int counter = 1;
        while (counter < n - 1) { // Stop 1 node short of the target
            curr = curr.next;
            counter++;
        }
        
        // 3. Skip the target node
        curr.next = curr.next.next;
        
        // 4. Reverse the entire list back to original order and return it
        return reverseList(reversedList);
    }
    
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}