class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) return head;

        // Dummy node before head
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Step 1: move 'prev' to the node before 'left'
        ListNode prev = dummy;
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        // Step 2: reverse sublist between left and right
        ListNode curr = prev.next;   // first node of sublist
        ListNode next = null;

        for (int i = 0; i < right - left; i++) {
            next = curr.next;
            curr.next = next.next;
            next.next = prev.next;
            prev.next = next;
        }

        return dummy.next;
    }
}
