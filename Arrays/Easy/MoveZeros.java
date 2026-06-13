package Arrays.Easy;

// 5. Move Zeros to End
public class MoveZeros {
    public static void main(String[] args){
        int arr[]={0,1,0,3,12};
        int j=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[j++]=arr[i];
            }
        }
        while(j<arr.length){
            arr[j++]=0;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
