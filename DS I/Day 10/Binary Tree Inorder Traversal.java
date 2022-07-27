class Solution {

public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> ans = new ArrayList<>();
    if(root==null){
        return ans;
    }
    else if(root.right==null && root.left==null){
        ans.add(root.val);
        return ans;
    }
    else{
       return inOrder(root,ans);
    }
}
private List<Integer> inOrder(TreeNode point, List<Integer> ref){
    if(point==null){
        return ref;
    }
    inOrder(point.left,ref);
    ref.add(point.val);
    inOrder(point.right,ref);
    return ref;
}
}