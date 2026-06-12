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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return add(l1, l2, 0);
    }
    public ListNode add(ListNode l1, ListNode l2, int carry) {
        if (l1 == null &&  l2 == null && carry == 0) {
            return null;
        }
        int valueOne = 0;
        int valueTwo = 0;
        if (l1 != null) {
            valueOne = l1.val;
        }
        if (l2 != null) {
            valueTwo = l2.val;
        }
        int value = valueOne + valueTwo + carry;
        int digit = value % 10;
        carry = value / 10;
        ListNode nextNode = add((l1 == null) ? null : l1.next, (l2 == null) ? null : l2.next, carry );
        return new ListNode(digit, nextNode);
    }
}
