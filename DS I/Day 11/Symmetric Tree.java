class Solution {
TreeNode lefty=null;
TreeNode righty=null;
public boolean isSymmetric(TreeNode root) {

    return isMirror(root,root);
}
public boolean isMirror(TreeNode root1,TreeNode root2){
    if(root1 == null && root2 ==null)
        return true;
    else if(root1 ==null || root2==null)
        return false;
    if(root1.val != root2.val)
        return false;
    if(!isMirror(root1.left,root2.right))
        return false;
    if(!isMirror(root1.right,root2.left))
        return false;
    return true;
 
}
}