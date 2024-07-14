package arrayList;

import java.util.ArrayList;

/**
 * reverse_arrayList
 */
public class reverse_arrayList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(2);
        list.add(8);
        list.add(30);
        list.add(1);
        list.add(9);
        
        reverse(list);
        

    }

    static void reverse(ArrayList<Integer> list){
        System.out.println("ArrayList size: " + list.size());
        System.out.print("before reverse : ");
        System.out.println(list);

        System.out.print("After reverse: ");
        for(int i=list.size()-1; i>=0; i--){
            System.out.print(list.get(i) + " ");
        }
    

    }

}