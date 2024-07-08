import java.util.Scanner;

public class javaBasicFunction {
    private static void printHello(String name) {
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i) + " ");
        }
        System.out.println();
    }

    static void printInterger(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print(i + " ");

        }
        System.out.println();
    }

    static void findName(String[] name, String findStr) {
        for (int i = 0; i < name.length; i++) {
            if (name[i] == findStr) {
                System.out.println("Found at index " + i + " and name element " + name[i]);
            }
        }
        System.out.println("Not found");
    }

    static int sumFun(int a, int b) {
        return a + b;
    }

    static void swap(int a, int b) {
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("Print after function");
        System.out.println("a : " + a + " , " + " b " + b);
    }

    static int product(int a, int b) {
        return a * b;
    }

    static int factorial(int fact) {
        if (fact == 0 || fact == 1)
            return 1;

        int result = 1;
        for (int i = 1; i <= fact; i++) {
            result *= i;
        }

        return result;

    }

    static int overloading(int a, int b) {
        return a + b;
    }

    static int overloading(int a, int b, int c) {
        return a + b + c;
    }

    static boolean check(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }

        }

        return true;
    }

    static void allPrimeNumberFind(int start, int end){
        for(int i=start; i<=end; i++){
            if(check(i)){
                System.out.print(i + ", ");
            }
        }
        return;
    }

    static int decimalToBinary(int num){
        int result =0;
        int base = 0;
        while(num>0){
            int rem = num%10;
            result += rem * Math.pow(2,base);
            base++;
            num = num/10;
        }

        return result;

    }


    static int binaryToDecimal(int binary){
        int dec=0;
        int base =0;
        while(binary>0){
            int rem = binary%2;
            dec += rem * Math.pow(10,base);
            base++;
            binary = binary/2;
        }

        return  dec;
    }


    public static void main(String[] args) {

        // Calling printHello function
        // printHello("Vikas");
        // printInterger(10);

        // String str[] = {"Vikas", "Sudhir", "Awnish", "Rajesh","Ramesh"};
        // String findStr = "Rajesh";
        // findName(str, findStr);

        // --------------------sum Tow number ----------------
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt(), b = sc.nextInt();
        // System.out.println("Sum of two number is " + sumFun(a,b));

        // ---------------------- swap in two number (call by value) -------------------
        // int a =10, b=5;
        // swap(a,b);
        // System.out.println("a : " + a + " , " + " b " + b); // here not swap because
        // function pass call by value

        // ---------------- product (call by refrence)
        // int a=5, b=10;
        // int value = product(a,b);
        // System.out.println(value);

        // ------------ find factorial
        // int fact = 5;
        // int value = factorial(5);
        // System.out.println(value);



        //---------------------------- funciton overloading
        // System.out.println(overloading(10,20));
        // System.out.println(overloading(10,20,30));




        //-----------------------------check number prime ya not
        // Scanner sc = new Scanner(System.in);
        //     System.out.println("Enter the number");
        //     boolean value = check(sc.nextInt());
        //     System.out.println(value);

        // -------------------------------all range prime number print
        // int start=1, end=100;
        // allPrimeNumberFind(start,end);

         

        //---------------------------convert from binary to decimail
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number: ");
        // int decimailNumber = sc.nextInt();
        // System.out.println(decimalToBinary(decimailNumber));

        //--------------------------convert from decimail to binary
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Binary Number: ");
        int binaryNumber = sc.nextInt();
        System.out.println("Decimal Number:" + binaryToDecimal(binaryNumber));














    }
}