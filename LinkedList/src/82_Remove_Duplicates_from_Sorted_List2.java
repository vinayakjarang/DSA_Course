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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode prev = null;
        ListNode frst = head;
        ListNode snd = head.next;
        while (snd != null) {
            if (frst.val == snd.val) {
                while (frst.val == snd.val) {
                    snd = snd.next;
                    if (snd == null) {
                        if (prev == null) {
                            return null;
                        }
                        prev.next = null;
                        return head;
                    }
                }
                if (prev == null) {
                    head = snd;
                    frst = head;
                    snd = head.next;
                } else {
                    prev.next = snd;
                    frst = snd;
                    snd = snd.next;
                }
            } else {
                prev = frst;
                frst = snd;
                snd = snd.next;
            }
        }
        return head;
    }
}