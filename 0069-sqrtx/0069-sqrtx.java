class Solution {
    public int mySqrt(int x) {
        int i=0;
        int j=x;
        int ans=-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            long val=(long) mid*mid;
            if(val==x){
                ans=mid;
                break;
            }
            else if(val<x){
                ans=mid;
                i=mid+1;
            }else{
                j=mid-1;
            }
        }
        return ans;
    }
}
/*
class Solution {
    public int mySqrt(int x) {
        // IBUILD  METHOD IS FASTEST THAN TEH BINARY 
        return (int)(Math.sqrt(x));
    }
}
*/