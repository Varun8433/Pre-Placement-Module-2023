class Solution {

public int binSearch(int a[],int l,int h,int key){
    if(l<=h){
        int m=l+(h-l)/2;
        if(a[m]==key){
            return m;
        }
        if(a[m]>=a[l]){  //sorted left half.
            if(key <= a[m] && key >= a[l]){
                return binSearch(a,l,m-1,key);
            }else{
                return binSearch(a,m+1,h,key);
            }
        }else{  //sorted right half.
            if(key >= a[m] && key <= a[h]){
                return binSearch(a,m+1,h,key);
            }else{
                return binSearch(a,l,m-1,key);
            }
        }
    }
    return -1;
}
public int search(int[] nums, int target) {
    int n=nums.length;
    return binSearch(nums,0,n-1,target);
}
}