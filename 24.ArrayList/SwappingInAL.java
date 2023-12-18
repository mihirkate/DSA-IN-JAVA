import java.util.ArrayList;
import java.util.Collections;

public class SwappingInAL {
    public static void Swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
    public static void Sorting(ArrayList<Integer> list){
        Collections.sort(list);
        // Collections.sort(list,Collections.reverseOrder());
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        list.add(0);
        int idx1 = 1, idx2 = 3;
        System.out.println(list);
        Swap(list, 3, 5);
        System.out.println(list);
        Sorting(list);
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }


    }


