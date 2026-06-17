package Arrays;
// 1. Find the maximum and second maximum element in an array
public class MaxAndSecondMax {
    public static void main(String[] args){
        int arr[]={2,6,9,1,9};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                secondMax=max;
                max=arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Second Max: " + secondMax);
    }
}
