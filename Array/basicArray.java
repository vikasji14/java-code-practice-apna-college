package Array;

import java.util.Scanner;

public class basicArray {

    public static void main(String[] args) {
        // int arr[] = {10, 20, 30, 40, 50};
        // System.out.println(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + " " + arr[4]);
       
        Scanner sc = new Scanner(System.in);
        String str[] = new String[5];
        for(int i=0; i<str.length; i++){
            str[i] = sc.next();
        }

        for(int i=0; i<str.length; i++){
            System.out.print(str[i] + ",");
        }

    }
}