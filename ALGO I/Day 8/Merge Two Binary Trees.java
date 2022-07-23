class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1==null&&root2==null)    //if both the trees are empty
            return null;
        else if(root1==null)            //if first tree is empty
            return root2;
        else if(root2==null)            //if second tree is empty
            return root1;        
        int sum = root1.val+root2.val;  //sum of the root nodes of both tree
        TreeNode newroot = new TreeNode(sum, mergeTrees(root1.left, root2.left),mergeTrees(root1.right, root2.right));        
        return newroot;    
    }
}