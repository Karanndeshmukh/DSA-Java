/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low=1;
        int ans=0;
        while(low<n){
            int mid=low+(n-low)/2;
            if(isBadVersion(mid)){
                n=mid;
            }else {
                low=mid+1;
            }
        }
        return low;
    }
}
