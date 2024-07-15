package TCS;

import java.util.Arrays;

public class order {
    public static void main(String[] args) {
        int arr[] = { 1, 8, 3, 2, 5, 9, 7 };
        System.out.print("Sorted Array: ");
        Arrays.sort(arr);
        for (int i = 0; i < arr.length/2; i++) {
            System.out.print(arr[i] + " ");
        }
        for(int i=arr.length-1; i>=arr.length/2; i-- ){
            System.out.print(arr[i] + " ");
        }
        

        

    }
}
