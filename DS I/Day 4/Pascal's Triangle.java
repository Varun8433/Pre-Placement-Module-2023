class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans =new ArrayList<List<Integer>>();
        List<Integer> initrow =new ArrayList<Integer>();
        initrow.add(1);
        ans.add(initrow);
        if(numRows == 1){
            return ans;
        }
        for(int i=1;i<numRows;i++){
            List<Integer> row =new ArrayList<Integer>();
            int sum=0;
            for(int j=0;j<=i;j++){
                if(j<ans.get(i-1).size()){
                    sum+=ans.get(i-1).get(j);
                }
                    
                if(j-1>=0){
                    sum+=ans.get(i-1).get(j-1);
                }
                row.add(sum);
                sum=0;
            }
            ans.add(row);
        }
        return ans;
    }
}