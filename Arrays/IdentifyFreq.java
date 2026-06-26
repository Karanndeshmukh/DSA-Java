package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IdentifyFreq {
    public static void main(String[] args) {
        int arr[]= {1,2,3,3,3,3,4,4,4,5,7};
        //Create Hahmap
        Map<Integer,Integer> freq = new HashMap<>();
        for(int num: arr){
        freq.put(num, freq.getOrDefault(num, 0)+1);
        }

        //Print keys and Value in Hahmap
        // for(int i: freq.keySet()){
        //     System.out.println(i+" "+freq.get(i));
        // }
        
        int maxkey=-1;
        int maxValue=-1;
        for(int key: freq.keySet()){
            int ck=key;
            int cv=freq.get(key);
            if(cv>maxValue){
                maxkey=ck;
                maxValue=cv;
            }
        }
        int minkey=Integer.MAX_VALUE;
        for(int key: freq.keySet()){
            int ck=key;
            int cv=freq.get(key);
            if(cv<maxValue){
                minkey=ck;
            }
        }
        int ans[] ={minkey, maxkey};
        System.out.println(Arrays.toString(ans));
    }
}
