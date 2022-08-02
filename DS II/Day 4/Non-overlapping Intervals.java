class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)-> Integer.compare(a[1],b[1]));
        int r = 0;
        
        int last = intervals[0][1];
        
        for(int i =1 ;i<intervals.length;i++){
            if(last>intervals[i][0]){
                r++;
            }else{
                last=intervals[i][1];
            }
        }
        
        return r;
    }
}
