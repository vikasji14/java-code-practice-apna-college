 package Array;

class largestNumber {

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int min = Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){
            if(arr[i]>min) min = arr[i];
        }
        System.out.println(min);
    }
}