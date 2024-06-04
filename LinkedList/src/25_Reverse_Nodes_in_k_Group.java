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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode Kthnode = head;
        ListNode prevnode = null;
        while (Kthnode != null) {
            int count = 1;
            while (count != k) {
                Kthnode = Kthnode.next;
                if (Kthnode == null) {
                    prevnode.next = temp;
                    return head;
                }
                count++;
            }
            ListNode nextnode = Kthnode.next;
            Kthnode.next = null;
            reverse(temp);
            if (temp == head) {
                head = Kthnode;
            } else {
                prevnode.next = Kthnode;
            }
            prevnode = temp;
            temp = nextnode;
            Kthnode = nextnode;

        }
        return head;

    }

    public void reverse(ListNode temp) {
        ListNode a = temp;
        ListNode b = temp.next;
        while (b != null) {
            ListNode aft = b.next;
            b.next = a;
            a = b;
            b = aft;
        }
        temp.next = null;
        temp = a;
        return;
    }
}