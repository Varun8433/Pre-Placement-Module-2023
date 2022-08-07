class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
         int n = candidates.length;
         List<List<Integer>> ans = new ArrayList<>();
         helper(ans, new ArrayList<>(), candidates, target, 0);
         return ans;
        
    }
    
    private void helper( List<List<Integer>>  ans, List<Integer> list, int[] candidates, int target, int ind){
            
            if(ind==candidates.length){
                if(target==0){
                 ans.add(new ArrayList<>(list));
            }  
                return;  
            }
               
        if(candidates[ind]<=target){
            list.add(candidates[ind]);
            helper(ans,list,candidates,target-candidates[ind],ind);
            list.remove(list.size()-1);
        }
        
        helper(ans,list,candidates,target,ind+1);
        
    } 
    
}