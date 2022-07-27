class Solution {
    public boolean isPowerOfTwo(int n) {
        //there should be only "1" in its binary number 
        if(n<=0)
            return false;
        return ((n&(n-1))==0);
    }
}