package recursion;

 import java.math.BigInteger;

public class fib_bigNumber {

    public static BigInteger fibonacci(int n) {
        if (n == 0) {
            return BigInteger.ZERO;
        } else if (n == 1) {
            return BigInteger.ONE;
        }

        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        BigInteger c = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            c = a.add(b);
            a = b;
            b = c;
        }

        return c;
    }

    public static void main(String[] args) {
        int n = 5000000;
        BigInteger result = fibonacci(n);
        System.out.println("The 500th Fibonacci number is: " + result);
    }
}

