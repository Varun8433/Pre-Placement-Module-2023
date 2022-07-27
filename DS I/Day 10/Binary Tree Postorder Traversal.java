class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> postorder = new ArrayList<>();
        postorderHelper(root, postorder);
        return postorder;
    }
    
    public void postorderHelper(TreeNode current, List<Integer> postorder) {
        if (current == null) return;
        
        postorderHelper(current.left, postorder);
        postorderHelper(current.right, postorder);
        postorder.add(current.val);
    }
}