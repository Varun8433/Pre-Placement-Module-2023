class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer>a=new HashSet<>();
        for(int x:nums){
            a.add(x);
        }
        if(nums.length!=a.size()){
            return true;
        }
        else{
            return false;
        }
    }
}