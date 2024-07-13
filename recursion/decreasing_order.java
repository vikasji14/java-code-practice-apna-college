package recursion;

/**
 * decresin_order
 */

public class decreasing_order {


    static void decreasing(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
         decreasing(n-1);

    }

    static void increasing(int n){
        if(n==1){
            System.out.print(n + " ");
            return;
        }

        increasing(n-1);
        System.out.print(n + " ");


    }


    public  static void main(String args[]){
        System.out.println("------------------Decreasing Order-----------------------");
        decreasing(20);
        System.out.println();
        System.out.println("------------------Increasing Order-----------------------");
        increasing(20);
    }
        
}