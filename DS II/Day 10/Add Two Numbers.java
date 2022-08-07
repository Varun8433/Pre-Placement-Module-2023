class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode curr1 = l1;
        int size1 = 0, size2 = 0;
        
        while(curr1!=null){
            size1++;
            curr1 = curr1.next;
        }
        
        curr1 = l2;
        
        while(curr1!=null){
            size2++;
            curr1 = curr1.next;
        }
        ListNode temp;
        ListNode req;
        ListNode curr2 = l2;
        curr1 = l1;
        
        if(size1<=size2){
            size1=size2;
            temp = req= l2;
        }
        
        else
            temp = req = l1;
        int carry = 0;
        for(int i=0; i<size1; i++){
            int c1 = 0, c2=0;
            if(curr1!=null)
                c1 = curr1.val;
            if(curr2!=null)
                c2 = curr2.val;
            int sum = c1+c2 + carry;
            temp.val = sum%10;
            carry = sum/10;
            temp = temp.next;
            if(curr1!=null)
                curr1 = curr1.next;
            if(curr2!=null)
                curr2 = curr2.next;
            }
        
        if(carry!=0){
            ListNode newNode = new ListNode(carry);
            ListNode curr = req;
            while(curr.next!=null)
                curr = curr.next;
            curr.next = newNode;
        }
        
        return req;
    }
}