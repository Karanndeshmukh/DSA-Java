package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Shiftbbyone {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        Scanner sc= new Scanner(System.in);
        int k=sc.nextInt(); //2
        k = k % arr.length; //remainder times size
        int temp[]= new int[k]; //temp ={0,1}
        //element stored
        for(int j=arr.length-k, t=0; j<=arr.length-1;j++){  //j=5 t=0, j<=6
            temp[t]=arr[j];                                   //temp[0]=5 temp[1]=6
            t++;
        }

        //shift element to right
        for(int i=arr.length-1;i>=k;i--){ 
            arr[i]=arr[i-k];           
        }

        //change k element
        for(int i=0;i<k;i++){  //arr[0]=temp[0]=6  //arr[1]=temp[1]=7
            arr[i]=temp[i];
        }
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
