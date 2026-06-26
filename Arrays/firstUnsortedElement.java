package Arrays;

public class firstUnsortedElement {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,3,6,9};
        for(int i=0;i<arr.length-1;i++){
        if(arr[i]>arr[i+1]){
            System.out.println(arr[i+1]);
            break;
            }
        }
    }
}
