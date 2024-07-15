package TCS;

public class array {
    public static void main(String[] args) {
        int arr[] = {2,2,0,2,4};
        long sum = 0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }

        System.out.println(sum/arr.length);



    }
    
}
