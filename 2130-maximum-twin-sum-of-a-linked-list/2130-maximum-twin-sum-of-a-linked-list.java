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
    public int pairSum(ListNode head) {
        
        int size = size(head);
        int point = size / 2;
        
        ListNode curr = head;
        for (int i = 0; i < point - 1; i++) {
            curr = curr.next;
        }
        ListNode x = curr.next;
        curr.next = null;
        ListNode end = reverse(x);
        
        int answer = 0;
        while (head != null) {
            int sum = head.val + end.val;
            answer = Math.max(answer, sum);
            head = head.next;
            end = end.next;
        }
        
        return answer;
    }
    
    public ListNode reverse(ListNode head) {
        if (head == null) return null;
        
        ListNode a = head;
        ListNode b = head.next;
        
        if (b == null) {
            return head;
        }
        
        ListNode c = b.next;
        a.next = null;
        
        while (c != null) {
            b.next = a;
            a = b;
            b = c;
            c = c.next;
        }
        b.next = a;
        return b;
    }
    
    public int size(ListNode head) {
        if (head == null) 
            return 0;
        
        return 1 + size(head.next);
    }
}