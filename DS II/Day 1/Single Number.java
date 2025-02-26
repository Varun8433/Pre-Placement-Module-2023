class Solution {
    public int singleNumber(int[] nums) {
        // use bitwise operation!
        // ^ : XOR, returns 1(true) if different and 0(false) if same.
        // example: if we do 1 ^ 3, then we are actually doing:
        // 000000001
        // 000000011
        // Only 1 bit between them are different, so XOR them will cause 1 on that bit and 0 on others
        // 000000010
        // Thus, 1^3 = 2
        
        // Similarly, 1^1 = 0 since all bits are the same.
        // 3 ^ 0?
        // 000000011
        // 000000000
        // Here we only have last two bits different, so XOR causes 1 on these bits and 0 on others, which is
        // 000000011
        // Thus, anything ^ 0 = anything.
        
        // Thus for this question we just need to XOR all the things, because
        // two same things XOR causes 0, and 0 XOR the uniq value will give the uniq value.
        // THIS IS BECAUSE XOR IS COMMUTATIVE!!!! ORDER DOESN'T MATTER
        int result = 0;
        for (int curr : nums) {
            result = result ^ curr;
        }
        return result;
    }
}