/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        temp = head;
        for (int i = 0; i < k - 1; i++) {
            temp = temp.next;
        }
        ListNode temp2 = head;
        int s = size - k + 1;
        for (int i = 0; i < s - 1; i++) {
            temp2 = temp2.next;
        }
        int t1 = temp.val;
        temp.val = temp2.val;
        temp2.val = t1;

        return head;
    }
}