class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preorder = new ArrayList<>();
        preorderHelper(root, preorder);
        return preorder;
    }
    
    public void preorderHelper(TreeNode current, List<Integer> preorder) {
        if (current == null) return;
        
        preorder.add(current.val);
        preorderHelper(current.left, preorder);
        preorderHelper(current.right, preorder);
    }
}