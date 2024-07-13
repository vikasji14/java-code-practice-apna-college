package recursion;
import java.util.*;

public class remove_duplicates {
    public static void main(String[] args) {
        String str = "viiikkasss";
        duplicate(str,0,new StringBuilder(""), new boolean[26]);
    }

    static void duplicate(String str, int idx,StringBuilder sb, boolean arr[]){
        if(idx == str.length()){
            System.out.println(sb);
            return;
        }

        char currChar = str.charAt(idx);
        // System.out.println(currChar);
       

        if(arr[currChar - 'a'] == true){
            duplicate(str, idx+1, sb, arr);
        }
        else{
            arr[currChar - 'a'] = true;
            sb.append(currChar);
            duplicate(str, idx+1, sb, arr);
        }

    }

}
