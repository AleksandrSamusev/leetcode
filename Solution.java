//1290. Convert Binary Number in a Linked List to Integer
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Solution {
    public int getDecimalValue(ListNode head) {
        StringBuilder sb = new StringBuilder();
        ListNode p = head;
        while (p != null) {
            sb.append(p.val);
            p = p.next;
        }
        return Integer.parseInt(sb.toString(), 2);
    }
}