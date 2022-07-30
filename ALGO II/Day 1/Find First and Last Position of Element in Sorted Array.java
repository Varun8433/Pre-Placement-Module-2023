class Solution {
public int[] searchRange(int[] nums, int target) {
int [] ans =new int [2];
ans[0]=-1;
ans[1]=-1;
for(int i=0;i<nums.length;i++)
{
if(nums[i]==target )
{
ans[0]=i;
break;

        }
        
    }
        for(int j=nums.length-1;j>=0;j--)
        {
            if(nums[j]==target)
            {
                if(j==0)
                {
                    ans[1]=0;
                }
              else
              {
                  ans[1]=j;
                break;
              } 
            }
            
        }
      return(ans);
}
}
   