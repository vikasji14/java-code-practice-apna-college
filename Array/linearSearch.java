package Array;

/**
 * linearSearch
 */


public class linearSearch {

    static boolean findElement(int arr[], int element){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == element) return true;
        }
        return false;

    }

    public static void main(String[] args){
        int arr[] ={10, 20, 30, 40, 50};
        boolean flag = findElement(arr, 30);
        String message = flag ? "Found " : "Not Found";
        System.out.println(message);
    }
}