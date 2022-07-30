class Solution {
int n;
public int findPeakElement(int[] a) {
    n = a.length;
    return f(a , 0 , n - 1);
}
int f(int a[] , int l , int r){
    while(l <= r){
        int m = (l + r) / 2;
        if((m == n - 1 || a[m] > a[m + 1]) && (m == 0 || a[m] > a[m - 1])) return m;
        else if(m != 0 && a[m] < a[m - 1]) r = m - 1;
        else if(m != n - 1 && a[m] < a[m + 1]) l = m + 1;
    }
    return -1;
}
}