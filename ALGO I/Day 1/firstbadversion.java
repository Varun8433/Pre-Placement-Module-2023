public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
        int l = 0;
        int h = n;
        
        int res = 1;
        
        while(l<=h)
        {
            int mid = l+(h-l)/2;
            
            if(isBadVersion(mid))
            {
                res = mid;
                h = mid-1;
            }
            
            else if(!isBadVersion(mid))
            {
                l = mid+1;
            }
        }
        
        return res;
    }
}
