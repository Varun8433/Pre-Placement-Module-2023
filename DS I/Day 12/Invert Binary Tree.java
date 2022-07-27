class Solution 
{
    public TreeNode invertTree(TreeNode root) 
    {
        // O(n) time | O(h) space
        if(root == null)    return null;
        
        swap(root);
        invertTree(root.left);
        invertTree(root.right);
        
        return root;
    }
    
    private void swap(TreeNode root)
    {
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
    }
}