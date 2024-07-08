package Array;

 
public class binary {


    public static boolean binarySearchFunction(int arr[], int element){
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start + end )/2;

            if(arr[mid] == element) return true;
            else if (element < arr[mid]){
                end = mid-1;
            }
            else if(element > arr[mid]){
                start = mid+1;
            }
        }
    
        return false; 
    }


    public static void main(String[] args){
        int arr[] = {10,34,234,2123,5667};
        boolean flag = binarySearchFunction(arr, 34);
        String message = flag ? "Found " : "Not Found";
        System.out.println(message);
    }
    
}