class Solution {
			public int rob(int[] nums) 
			{
				if(nums.length==1)
					return nums[0];
				int dp[]=new int[nums.length];
				dp[0]=nums[0];
				dp[1]=nums[1];
				int ans=0;
				for(int i=2;i<nums.length;i++)
				{
					if(i==2)
					{
						dp[i]=Math.max(dp[0]+nums[i],dp[1]);
						continue;
					}
					dp[i]=Math.max(dp[i-3]+nums[i],dp[i-2]+nums[i]);
				}
				for(int x:dp)
				{
					ans=Math.max(ans,x);
				}
				return ans;

			}
		}