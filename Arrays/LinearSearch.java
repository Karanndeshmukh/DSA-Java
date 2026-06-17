package Arrays;

// 6. Linear Search
public class LinearSearch {
    public static void main(String[] args){
        int arr[]={2,6,9,1,9,5};
        int target=9;
        int index=-1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                index=i;
                break;
            }
        }
        if(index!=-1){
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
