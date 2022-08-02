class Solution 
{
    /**
      * Runtime: 3 ms, faster than 97.41% of Java online submissions for Container With Most Water.
      * Memory Usage: 52.6 MB, less than 93.14% of Java online submissions for Container With Most Water.
      *
      */

    public int maxArea(int[] height) 
    {
        // linear solution 
        // start from outer edge and move inwards incrementing
        // the left pointer if right edge bar is greater than the left
        // the right pointer otherwise 
        // return when left pointer = right pointer 
        int max=0;
        int left=0;
        int right=height.length-1;
        while (left < right)
        {
            max = Math.max(max, (right-left) * (Math.min(height[left],height[right])));
            if (height[left] <= height[right])
                left++;
            else
                right--;
                                        
        }
        return max;
    }
}