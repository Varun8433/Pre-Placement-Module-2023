class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        int[][] result = new int[row][col];//output array
        int maxDistance = row+col;//max distance to find 0 (addition of opposite diagonal lengths)
        /** TOP LEFT TRAVERSAL   **/
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(mat[i][j] == 0){
                    continue;
                }
                result[i][j] = maxDistance;
                if(i > 0){
                    result[i][j] = Math.min(result[i][j],result[i-1][j]+1);// for index [1][1] searh [0][1] and [1][0]
                }
                if(j > 0){
                    result[i][j] = Math.min(result[i][j],result[i][j-1]+1);
                }
            }
        }
        /** END   **/
        /** BOTTOM RIGHT  TRAVERSAL   **/
        for(int i=row-1;i>=0;i--){
            for(int j=col-1;j>=0;j--){
                if(mat[i][j] == 0){
                    continue;
                }
                if(i < row-1){
                    result[i][j] = Math.min(result[i][j],result[i+1][j]+1);// for index [1][1] searh [2][1] and [1][2]
                }
                if(j < col-1){
                    result[i][j] = Math.min(result[i][j],result[i][j+1]+1);
                }
            }
        }
        /** END   **/
        /** We are traversing and top left and bottom right so as to find the minimum distance to reach "0" **/
        return result;
    }
}