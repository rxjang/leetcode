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
    public ListNode mergeNodes(ListNode head) {
        ListNode start = new ListNode();
        ListNode now = start;
        int val = 0;
        head = head.next;
        
        while (head != null) {
            val += head.val;
            head = head.next;
            if (head.val == 0) {
                head = head.next;
                ListNode temp = new ListNode(val);
                now.next = temp;
                now = temp;
                val = 0;
            }
        }
            
        return start.next;
    }
}