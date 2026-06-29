class Solution {
    public static int[] colSum(int arr[][]) {
        // Code Here
        int n=arr.length;
        int m=arr[0].length;
        int[] result=new int[m];
        for(int j=0;j<m;j++){
            int sum=0;
            for(int i=0;i<n;i++){
                int value=arr[i][j];
                sum=sum+value;
            }
            result[j]=sum;
        }
        return result;
    }
}