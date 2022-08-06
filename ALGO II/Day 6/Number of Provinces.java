class Solution {
    public int findCircleNum(int[][] isConnected) {
 
        int res=0;
        for(int i=0;i<isConnected.length;i++){
                if(isConnected[i][i]==1){
                    res++;
                    dfs(i,isConnected);
                }
            }
        return res;
    }
    public void dfs(int i,int[][]isConnected){
        isConnected[i][i]=0;
        for(int j=0;j<isConnected.length;j++){
            if(isConnected[j][i]==1&&isConnected[j][j]==1)
                dfs(j,isConnected);
        }
        
        
    }
   
}