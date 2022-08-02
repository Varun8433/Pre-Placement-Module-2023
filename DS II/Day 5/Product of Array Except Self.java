class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] left_prod = new int[n];
        int[] right_prod = new int[n];
        int[] output = new int[n];

        left_prod[0] = right_prod[n - 1] = 1;

        for(int i = 1; i < n; i++) {    // going from left to right and taking products
            left_prod[i] = nums[i - 1] * left_prod[i - 1];
        }

        for(int i = n - 2; i >= 0; i--) {   // going from right to left and taking products
            right_prod[i] = nums[i + 1] * right_prod[i + 1];
        }

        for (int i = 0; i < n; i++) {
            output[i] = left_prod[i] * right_prod[i];
        }

        return output;
    }
}
