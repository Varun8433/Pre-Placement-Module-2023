class Solution {
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ansList = new ArrayList<>();
        //The solution set must not contain duplicate subsets. Return the solution in any order.
        findSubset(0, nums, new ArrayList<>(), ansList);
        return ansList;
        
    }

    private static void findSubset(int index, int[] nums, List<Integer> temp, List<List<Integer>> ansList) {

        ansList.add(new ArrayList<>(temp));
        for (int i = index; i < nums.length; i++) {
            if(i != index  && nums[i] == nums[i -1]) continue;

            temp.add(nums[i]);
            findSubset(i+1, nums, temp, ansList);
            temp.remove(temp.size() - 1);

        }
    }
}