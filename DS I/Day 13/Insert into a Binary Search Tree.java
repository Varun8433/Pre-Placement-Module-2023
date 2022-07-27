class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null)
        {
            root = new TreeNode(val);
            return root;
        }
	helperTree(root, val);
    return root;
}
public void helperTree(TreeNode root, int val)
{
	if(root.val <val)
	{
		if(root.right == null)
		{
			root.right = new TreeNode(val);
			return;
		}
		else {
			helperTree(root.right, val);
		}
		
	}
	else {
		if(root.left == null)
		{
			root.left = new TreeNode(val);
			return;
		}
		else {
			helperTree(root.left, val);
		}
	}
}
}