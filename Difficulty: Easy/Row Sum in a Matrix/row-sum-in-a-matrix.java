class Solution {
    public static int[] rowSum(int arr[][]) {
        // Code here
        int n=arr.length;
        int m=arr[0].length;
        int[] result= new int[n];
        
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<m;j++){
                int value=arr[i][j];
                sum+=value;
            }
            result[i]=sum;
        }
        return result;
    }
}