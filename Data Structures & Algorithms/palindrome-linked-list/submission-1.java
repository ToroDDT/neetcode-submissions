class Solution {
    public boolean isPalindrome(ListNode head) {
        // Fix 1: Return a boolean instead of head
        if (head == null || head.next == null) return true; 

        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode secondHalf = slow.next;
        slow.next = null; 
        ListNode secondList = reverseList(secondHalf);
        
        // Fix 3: Point to head to compare from the start
        ListNode firstList = head; 

        while (secondList != null) {
            // Fix 2: Fixed typo from fistList to firstList
            if (secondList.val == firstList.val) { 
                secondList = secondList.next;
                firstList = firstList.next;
            }
            else {
                return false;
            }
        }
        return true;
    }

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = head;
        if (head.next != null) {
            newHead = reverseList(head.next);
            head.next.next = head;
            head.next = null;
        }
        return newHead;
    }
}