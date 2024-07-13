package recursion;

public class power {
    public static void main(String[] args) {
        int number = 2;
        int base = 10;
        System.out.print("Power: "  + power(number,base));
    }
    static int power(int number, int base){
        if(base == 1){
            return number;
        }
        int totalPower = power(number, base-1);
        totalPower *= number;
        System.out.println(base + " " + totalPower + " = " + totalPower);
        return totalPower;

        // return number*power(number, base-1);


        
    }
}
