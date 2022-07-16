class Solution {
    public void rotate(int[] nums, int k) {
	    // Handle edge cases
        if(nums.length == 1 || nums.length == k) return;
        if(k > nums.length) k = k % nums.length;
        
		// Create a copy of the input array
		// Create a counter to keep track of when the right shift exceeds the bounds of the array
        int[] tmp = nums.clone();
        int count = 0;
        
        for(int i = 0; i < nums.length; ++i) {
            if(i + k < nums.length) {
                nums[i + k] = tmp[i];
                count++;
            } else {
                nums[i - count] = tmp[i];
            }
        }
    }
}