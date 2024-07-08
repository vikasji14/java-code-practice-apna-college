package bit_manipulation;

/**
 * bit_oddEven
 */
public class bit_oddEven {

    static void checkOddEven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println("Even");
        }
        else if((n & bitMask) == 1){
            System.out.println("Odd");
        }
    }       


    public static void main(String args[]){
        checkOddEven(5);
        checkOddEven(6);
    }
}