package BinarySearch;
public class PeakIndexMountainArray {
    public int peakIndexInMountainArray(int[] arr) {
        int s=0;
        int e=arr.length-1;
        int ans=arr.length;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]>arr[mid+1]){
                ans=mid;
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        PeakIndexMountainArray solver = new PeakIndexMountainArray();

        // Test Case 1: Valid mountain array
        int[] arr1 = {0, 2, 1, 0};
        System.out.println("Peak index in mountain array: " + solver.peakIndexInMountainArray(arr1)); // Output: 1

        // Test Case 2: Another valid mountain array
        int[] arr2 = {0, 10, 5, 2};
        System.out.println("Peak index in mountain array: " + solver.peakIndexInMountainArray(arr2)); // Output: 1

        // Test Case 3: Larger mountain array
        int[] arr3 = {3, 4, 5, 1};
        System.out.println("Peak index in mountain array: " + solver.peakIndexInMountainArray(arr3)); // Output: 2
    }
}
