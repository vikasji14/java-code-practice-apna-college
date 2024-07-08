/**
 * digonal_sum
 */
public class digonal_sum {

    static int digonalSum(int arr[][]){
        int sum = 0;
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr[0].length;j++){
                if(i==j || i+j == arr.length-1){
                    sum += arr[i][j];
                }

            }
        }

        return sum;


    }

    public static void main(String args[]){

        int arr[][] = {
            {1,2,3,4},
            {4,5,6,5},
            {7,8,9,6},
            {7,8,9,6},
        };
        if(arr.length == arr[0].length){
            System.out.println("Digonal sum : " + digonalSum(arr));
        }else{
            System.out.println("Not a square matrix");}
    }
}