package string;

import java.util.Scanner;

/**
 * basic
 */
public class basic {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("My Name: " + name);
        System.out.println("Length: " + name.length());
        System.out.println("Upper Case: " + name.toUpperCase());
    }
}