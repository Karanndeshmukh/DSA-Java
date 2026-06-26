package Arrays;

public class Extremeelementinalternate {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int s=0, e=arr.length-1;
        while(s<=e){
            if(s==e){
                System.out.println(arr[s]);
                return;
            }
            System.out.print(arr[s]+" ");
            System.out.print(arr[e]+" ");
            s++; e--;
        }
    }
}
