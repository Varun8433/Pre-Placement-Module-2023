class Solution {

public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
  
    //two pointer
    //first = two array min
    //second = two array max
    List<int[]> result = new ArrayList();
    
    int fidx = 0;
    int sidx = 0;
    
    while(fidx < firstList.length && sidx < secondList.length) {
        
        int first = Math.max(firstList[fidx][0], secondList[sidx][0]);
        int second = Math.min(firstList[fidx][1], secondList[sidx][1]);
        
        if(first <= second) {
            int[] arr = {first, second};
            result.add(arr);
        }
        
        if(firstList[fidx][1] <= secondList[sidx][1]) {
            fidx++;
        }
        
        else sidx++;
    }
return result.toArray(new int[0][result.size()]);
}
}