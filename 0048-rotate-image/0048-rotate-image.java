class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        //Step 1: Transpose the Matrix
        //in-Place (SWAP)
        for(int i=0;i<n;i++){
            for(int j=i+1;j<m;j++){ //because upper half swap only
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        //Step 2:Reverse using Two pointer
        for(int i=0;i<n;i++){
            int s=0,e=matrix.length-1;
            while(s<=e){
                int temp=matrix[i][s];
                matrix[i][s]=matrix[i][e];
                matrix[i][e]=temp;

                s++;e--;
            }
        }
    }
}