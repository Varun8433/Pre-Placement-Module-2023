class Solution {
    void recursive(int startId, int n, int k, List<Integer> currset, List<List<Integer>> res){
        
        //base case
        if(k==0){
            res.add(new ArrayList<>(currset));
            return;
        }
        
        if(startId>n)
            return;
        
        //if no. of digits left in the subarray are less than k
        //pruning
        if(n-startId+1<k)
            return;
        
        //recursive step
        //exclude
        recursive(startId+1, n, k, currset, res);
       // 
        //include
        currset.add(startId);
        recursive(startId+1, n, k-1, currset, res);
        //pass by reference
        currset.remove(currset.size()-1);               


    }
    
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> currset= new ArrayList<>();
        List<List<Integer>> res=  new ArrayList<>();
        recursive(1, n, k, currset, res);
        return res;
    }
}