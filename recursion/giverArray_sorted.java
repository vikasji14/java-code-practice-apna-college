package recursion;

public class giverArray_sorted {
    public static void main(String[] args) {
        int arr[] = {1,1,2,4,5};

        System.out.println(isSorted (arr,0));
    }
    static boolean isSorted(int arr[], int index){
        if(index == arr.length-1){
            return true;
        }
        if(arr[index] > arr[index+1]){
            return false;
        }
        return isSorted(arr,index+1);
    }
}
