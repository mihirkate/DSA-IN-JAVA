import java.util.ArrayList;

public class DefineArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        // System.out.println(list);
        // // get operation
        // int el = list.get(3);
        // System.out.println("element at position " + "is " + el);
        // list.remove(2);
        // System.out.println(list);
        // set element
        // list.set(1,7);
        // System.out.println(list.contains(1));
        // System.out.println(list.contains(21));
        // adding number at particular index
        list.add(2,5);
        list.add(5,5);
        System.out.println(list);

         

    }

}