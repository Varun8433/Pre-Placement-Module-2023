class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int total=0;
        ListNode p=head;
        while(p!=null){
          total++;
          p=p.next;      
        }
        if(total-n+1==1)
            return head.next;
        ListNode cur=head;
        for(int i=1;i<total-n;i++){
            cur=cur.next;
        }
        cur.next=cur.next.next;
        return head;
        
    }
}