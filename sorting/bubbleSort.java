 package sorting;

 public class bubbleSort {

    static void bubbleSortFunction(int[] arr){
        for(int turn=0; turn<arr.length-1; turn++){
            System.out.print("Turn - " + turn + " : ");
            printArray(arr);
            for(int j=0; j<arr.length-1-turn ; j++){
                System.out.println("Range - " + j + " to " + (arr.length-1-turn) + " : ");
                System.out.print(" Comparing " + arr[j] + " and " + arr[j+1] + " - ");
                if(arr[j]>arr[j+1]){
                    System.out.print(", Swapping " + arr[j] + " and " + arr[j+1] + " - ");
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                printArray(arr);
            }
        }
    }

    static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main (String args[]){
        int arr[] = {2,10,4,9,7,6,8};
        bubbleSortFunction(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}