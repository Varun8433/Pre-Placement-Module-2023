class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = new ListNode(-101, head);
        ListNode answer = temp;
        while (temp.next != null && temp.next.next != null) {
            int val = temp.next.val;
            if (val == temp.next.next.val) {
                ListNode temp2 = temp.next;
                while (temp2 != null && temp2.val == val) temp2 = temp2.next;
                temp.next = temp2;
            } else temp = temp.next;
        }
        return answer.next;
    }
}