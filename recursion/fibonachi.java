package recursion;

/**
 * fibonachi
 */
public class fibonachi {

    static long fibonachi(int n){
        if(n==0 || n==1){
            return n;
        }
        long fn = fibonachi(n-1) + fibonachi(n-2);
        return fn;

        
    }


    public static void main(String args[]){
        int n = 500;
        for(int i=0;i<=n;i++){
            System.out.println( i + " : " +fibonachi(i) + " ");
        }

    }
}