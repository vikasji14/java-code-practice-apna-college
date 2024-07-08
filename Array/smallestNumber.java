package Array;

/**
 * smallestNumber
 */
public class smallestNumber {

   public static void main(String[] args){
        int arr[] = {10, 20, 30, 40, 50};
        int max = Integer.MAX_VALUE;
        System.out.println(max);
        for(int i=0; i<arr.length;i++){
            if(arr[i] < max) max = arr[i];
        }


        System.out.println(max);
    }
}