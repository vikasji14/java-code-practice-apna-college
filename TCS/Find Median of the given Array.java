package TCS;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6,7,8};
        Arrays.sort(arr);
        
        if(arr.length % 2 != 0){
            System.out.println(arr[arr.length /2]);
        }else{
            int median = arr[arr.length/2] + arr[arr.length/2 - 1];
            System.out.println(median);
        }



    }
    
}
