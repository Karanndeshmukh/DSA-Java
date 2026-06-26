package Arrays;

import java.util.Scanner;

// 2. Check if Array is Sorted
public class AvgArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter input of an array");
        int size=sc.nextInt();
        int arr[]= new int [size];
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int avg=sum/arr.length;
        System.out.println(avg);
        sc.close();
    }
}