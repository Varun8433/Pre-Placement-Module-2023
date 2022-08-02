class Solution {
public void rotate(int[][] matrix) {
int n=matrix.length;
int m=matrix[0].length;
for(int i=0;i<n;i++){ //Transpose of the matrix.
for(int j=i+1;j<m;j++){
int temp=matrix[i][j];
matrix[i][j]=matrix[j][i];
matrix[j][i]=temp;
}
}
for(int i=0;i<n;i++){ //Reverse the matrix.
int lo=0,hi=m-1;
while(lo<hi){
int temp=matrix[i][lo];
matrix[i][lo]=matrix[i][hi];
matrix[i][hi]=temp;
lo++;
hi--;
}
}
}
}