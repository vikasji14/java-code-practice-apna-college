package arrayList;
import java.util.ArrayList;
public class basic {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Character> list3 = new ArrayList<>();
        ArrayList<Boolean> list4 = new ArrayList<>();

        list1.add(1);
        list1.add(10);
        list1.add(4);
        System.out.println(list1);


        list2.add("Vikas");
        list2.add("Ram");
        list2.add("Shyam");
        System.out.println(list2);
        for(int i=0; i<list2.size() ; i++){
            System.err.print(list2.get(i));
        }



        list3.add('V');
        list3.add('I');
        list3.add('K');
        list3.add('S');
        System.err.println(list3);
        

        list4.add(true);
        list4.add(false);
        System.err.println(list4);


        System.out.print(list1.contains(4));
    }
}
