class Solution {
    public Node connect(Node root) {
        if(root==null)return null;
        Queue<Node> q=new LinkedList<>();
        Node head=root;
        q.add(head);
        while(!q.isEmpty()){
            int n=q.size();
            ArrayList<Node> arr=new ArrayList<>();
            while(n-->0){
                Node temp=q.poll();
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
                arr.add(temp);
            }
            for(int i=0;i<arr.size()-1;i++){
                arr.get(i).next=arr.get(i+1);
            }
        }
        return root;
    }
}