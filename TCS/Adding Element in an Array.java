package TCS;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        Scanner sc = new Scanner(System.in);
        int element =  sc.nextInt();
        addArrayElemetn(arr,element,arr.length);
       

    }

    static void addArrayElemetn(int arr[], int element, int length){
        int newArr [] = new int[length+1];
        newArr[0] = element;
        for(int i=1; i<newArr.length; i++){
            newArr[i] = arr[i-1];
        }

        for (int i : newArr) {
            System.out.print(i + " ");
        }
        
        
    }


    
}
