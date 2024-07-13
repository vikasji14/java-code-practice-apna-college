package recursion;

public class factorial {
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }

        int fn = n * factorial(n-1);
        return fn;

    }

    public static void main(String args[]){
        int n = 8;
        factorial(n);
        System.out.println("Factorial of " + n + " is : " + factorial(n));
    }
}
