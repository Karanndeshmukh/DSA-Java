package Arrays;
public class LongestSubarray {
    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        int k=9;
        Solution sol=new Solution();
        System.out.println(sol.longestSubarray(arr,k));
    }
}
class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        int left=0; int right =0;
        int sum=arr[0];
        int maxLen=0;
        while(right<arr.length){
            while(left<right && sum>k){
                sum-=arr[left];
                left++;
            }
            if(sum==k){
                maxLen=Math.max(maxLen,right-left+1);
            }
            right++;
            if(right<arr.length){
                sum+=arr[right];
            }
        }
        return maxLen;
    }
}
