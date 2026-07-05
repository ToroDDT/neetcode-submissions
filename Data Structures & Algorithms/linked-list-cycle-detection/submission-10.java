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
    public boolean hasCycle(ListNode head) {
        // if head == null then their is no cycle
        if (head == null) {
            return false;
        }
        // create4 a HashSet this will store the ndoes that have been visistied 
        HashSet<ListNode> set = new HashSet<>();
        ListNode pointer = head;
        while (pointer != null) {
            if (set.contains(pointer)) {
                return true;
            }
            set.add(pointer);
            pointer = pointer.next;
        }
        return false;
    }
}
