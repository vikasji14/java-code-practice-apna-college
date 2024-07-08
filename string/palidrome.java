import java.util.*;
/**
 * palidrome
 */
public class palidrome {

    static boolean checkPalindrome(String str){
        for(int i=0; i<str.length()/2; i++){
            System.out.println(str.charAt(i) + " = " + str.charAt(str.length()-i-1));
            if(str.charAt(i) != str.charAt(str.length()-i-1)) {
                System.out.println(str.charAt(i) + " = " + str.charAt(str.length()-i-1));
                return false;
            }
        }
        return true;
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.nextLine();
        boolean flag = checkPalindrome(str);
        String message = flag ? "Palindrome " : "Not Palindrome ";
        System.out.println(message);
    }
}