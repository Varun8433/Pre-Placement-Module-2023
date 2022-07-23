class Solution {
    public Node connect(Node root) {
        Node leftMost = root;
        if(leftMost == null)                //if the tree is empty 
            return null;
        while(leftMost.left!=null)          //if the tree has left child
        {
            leftMost.left.next = leftMost.right;    //connecting the left and right child
            Node cur = leftMost.left.next;          
            Node head = leftMost.next;
            while(head!=null)                       //to connect all the nodes at same level
            {
                cur.next = head.left;
                cur = cur.next;
                cur.next = head.right;
                cur = cur.next;
                head = head.next;
            }
            leftMost = leftMost.left;   //to move to left child
        }       
        return root;    
    }
}