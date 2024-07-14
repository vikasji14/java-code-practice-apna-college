package arrayList;
import java.util.*;

public class find_maximum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(20);
        list.add(4);
        list.add(15);
        list.add(9);
        list.add(12);
        list.add(7);
        list.add(18);

        System.out.println(findMax(list));
        Collections.sort(list) ;
        System.out.println("Sorted ArrayList  : " + list);
        
        

    }

    static int findMax(ArrayList<Integer>list){
        int maxNumber = Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++){
            maxNumber = Math.max(maxNumber, list.get(i));

        }
        return maxNumber;

    }
}
