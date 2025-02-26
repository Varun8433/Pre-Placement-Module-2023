class Solution {
    public void sortColors(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int i = 0;
        while (i <= r) {
            if (nums[i] == 0) {
                // Swap with the left
                nums[i] = nums[l];
                nums[l] = 0;
                i++;
                l++;
            } else if (nums[i] == 2) {
                // Swap with the right
                nums[i] = nums[r];
                nums[r] = 2;
                r--;
            } else {
                i++;
            }
        }        
    }
}