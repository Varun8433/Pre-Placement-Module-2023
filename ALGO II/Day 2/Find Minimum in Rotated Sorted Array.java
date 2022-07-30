class Solution {
public int findMin(int[] nums) {
int start = 0;
int end = nums.length-1;
int mid = 0;

    while(start<=end){
        if (nums[start] < nums[end]){
            return nums[start];
        }
        mid = start + (end-start)/2;
        int prev = (mid + nums.length - 1)%nums.length;
        int next = (mid+1)%nums.length;
        if (nums[mid] <= nums[prev] && nums[mid] <= nums[next]){
            return nums[mid];
        }
        else if(nums[start] <= nums[mid]){
            start = mid+1;
        }
        else if(nums[mid] <= nums[end]){
            end = mid-1;
        }
    }
    return -1;
}
}