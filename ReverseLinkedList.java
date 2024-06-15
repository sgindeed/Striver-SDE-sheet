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
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode after = null;
        ListNode before = null;

        while(current != null)
        {
            after = current.next;
            current.next = before;
            before = current;
            current = after;
        }
        return before;
    }
}
