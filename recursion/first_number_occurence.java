package recursion;

public class first_number_occurence {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 4, 5, 6, 4, 8, 9, 10 };
        int x = 4;
        System.out.println( firstOccurence(arr, 0, x));
        System.out.println( lastOccurence(arr, arr.length-1, x));
    }

    static int firstOccurence(int arr[], int index, int x){
        if(index == arr.length){
            return -1;
        }
            if(arr[index] == x) {
                System.out.println("First Occurence Index: " + index);
                return 1;
            }

            return firstOccurence(arr, index+1, x);
    }

    static int lastOccurence(int arr[], int index, int x){
        if(index < 0){
            return -1;
        }
            if(arr[index] == x) {
                System.out.println("Last Occurence Index: " + index);
                return 1;
            }
            return lastOccurence(arr, index-1, x);
    }

}
