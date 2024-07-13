package bit_manipulation;
import java.util.Scanner;

/**
 * power_find
 */
public class power_find {
    
    static boolean checkPowerofTowYaNot(int n){
        return (n & (n-1)) == 0 ? true : false;
    }


    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        System.out.print("Result : " + checkPowerofTowYaNot(n));


    }
}