class Solution {
public boolean searchMatrix(int[][] a, int x) {
int m = a.length;
int n = a[0].length;
int i=0,j=n-1;
while(i<m && j>=0)
{
if(a[i][j]==x)
{
return true;
}
if(a[i][j]<x)
{
i++;
}
else{
j--;
}
}
return false;
}
}