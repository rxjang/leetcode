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
        List<Integer> list = new ArrayList<>();
        
        while(true) {
            list.add(head.val);
            head = head.next;
            if (head == null) {
                break;
            }
        }
        
        int size = list.size();
        int answer = 0;
        for (int i = 0; i < size / 2; i++) {
            int sum = list.get(i) + list.get(size - 1 - i);
            answer = Math.max(answer, sum);
        }
        
        return answer;
    }
}