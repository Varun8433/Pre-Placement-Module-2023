class Solution {
    public int[] sortedSquares(int[] nums) {
        int i = 0 ;
        int j = nums.length - 1 ;
        int k = nums.length - 1 ;
        int res[] = new int[nums.length] ;
        while( i <= j ){
            int val1 = Math.abs(nums[i]) ;
            int val2 = Math.abs(nums[j]) ;
            if( val1 > val2 ){
                res[k--] = val1 * val1 ;
                i++ ;
            }
            else{
                res[k--] = val2 * val2 ;
                j-- ;
            }
        }
        return res ;
    }
}