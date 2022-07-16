class Solution {
    public int[] twoSum(int[] nums, int target) {
        //hashmap to store array elements with its index
        Map<Integer, Integer> nums_map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int comp = target-nums[i];
            //check if ihe complement is available in the hashmap
            //nums_map.get(comp) - will return its index
            if(nums_map.containsKey(comp)){
                return new int[]{nums_map.get(comp), i};
            }
            //insert the array element and its index in the hashmap
            nums_map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}