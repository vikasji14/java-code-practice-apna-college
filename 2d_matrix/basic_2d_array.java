import java.util.Scanner;
public class basic_2d_array{

    static boolean searchElement(char matrix[][], char element){
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(matrix[i][j] == element){
                    System.out.println("Element found at index " + i + " " + j);
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        char matrix[][] = new char[3][3];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                matrix[i][j] = sc.next().charAt(0);
            }
        }
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
               System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        boolean flag = searchElement(matrix,'g');
        String message = flag ? "Found " : "Not Found";
        System.out.println(message);


    }
}