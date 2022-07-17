class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                
                if (nums[i] == 0 && nums[j] != 0) {
                    swap(i, j, nums);
                    i++;
                }
            }
        }
    }
    
    private void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}