class Solution {
    public int climbStairs(int n) {
        if (n <= 1) {
            return n;
        }
        int num1 = 1;
        int num2 = 2;
        for (int i = 0; i < n - 2; i++) {
            int tmp = num1;
            num1 = num2;
            num2 = num2 + tmp;
        }
        return num2;
    }
}