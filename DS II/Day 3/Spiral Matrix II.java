class Solution {
    public int[][] generateMatrix(int n) {
        int[][] generateMatrix=new int[n][n];

        int top=0,left=0,bottom=n-1,right=n-1;
        int i=1;
        while(top<=bottom && left<=right){
            for(int j=left;j<=right;j++ ){
                generateMatrix[top][j]=i;
                i++;
            }
            top++;
            for(int j=top;j<=bottom;j++){
                generateMatrix[j][right]=i;
                i++;
            }
            right--;
            if(top<=bottom){
                for(int j=right;j>=left;j--){
                    generateMatrix[bottom][j]=i;
                    i++;
                }
                bottom--;
            }
            if(left<=right){
                for(int j=bottom;j>=top;j--){
                    generateMatrix[j][left]=i;
                    i++;
                }
                left++;
            }
        }
        return generateMatrix;
    }
}