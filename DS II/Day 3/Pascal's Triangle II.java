class Solution {

public List<Integer> getRow(int rowIndex) {
    int[][] matrix = new int[rowIndex+1][rowIndex+1];
    for(int i = 0; i <= rowIndex; i++){
        matrix[i][0] = 1;
    }
    
    List<Integer> myList = new ArrayList<Integer>();
    for(int i = 1; i <= rowIndex; i++){
        for(int j = 1; j <= i; j++){
            matrix[i][j] = matrix[i-1][j] + matrix[i-1][j-1];
        }
    }
    
    for(int i = 0; i <= rowIndex; i++){
        myList.add(matrix[rowIndex][i]);
    }
    return myList;
}    
}