class Solution {
    public int maxSubArray(int[] arr) {
        //Create two variables : one will store sum of the current subarray and other will store maximum in the whole array

        //Taking MIN_VALUE so that it gets upadted even when negative numbers are present in array
        int maxSoFar = Integer.MIN_VALUE;
        int maxEndingHere = 0;
        
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            maxEndingHere += arr[i];
            
            //If sum of current subarray is greater then we update maxSoFar
            if(maxEndingHere > maxSoFar) {
                maxSoFar = maxEndingHere;
            }

            //If sum is negative then we change it to 0 and start again
            if(maxEndingHere < 0) {
                maxEndingHere = 0;
            }
        }

        return maxSoFar;
    }
}