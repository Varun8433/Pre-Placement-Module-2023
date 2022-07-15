class Solution {
    public int searchInsert(int[] nums, int target) {
        
        //edge cases if target should be present at first or last index
        if(target > nums[nums.length-1])
            return nums.length;
        if(target < nums[0])
            return 0;
        
        int high = nums.length, low = 0;
        
        
        while(low<high){
            //modifying mid for every high and low.
            int mid = low + (high - low)/2;
            
            if(nums[mid] == target)
                return mid;
            if(nums[mid] < target && nums[mid+1] > target)
                return mid+1;
            //if val present at mid index of nums is less than target our target will be on the right of the mid. Hence low is assigned to mid
            else if(nums[mid] < target)
                low = mid;
            
            //if val present at mid index of nums is greater than target our target will be on the left of the mid. Hence high is assigned to mid
            else if(nums[mid] > target)
                high  = mid;
        }
        return 0;
    }
}