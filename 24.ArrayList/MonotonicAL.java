import java.util.ArrayList;

public class MonotonicAL {
    public static boolean monoTonic(ArrayList<Integer> list) {
        boolean inc = true;
        boolean dec = true;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                inc = false;
            }
            if (list.get(i) <= list.get(i + 1)) {
                dec = false;
            }
        }
        return inc || dec;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        // list.add(2);
        // list.add(9);
        // list.add(10);
        for (int i = 0; i < list.size(); i++) {
            // System.out.println("list.get(i-1) "+list.get(i-1));
            System.out.println("list.get(i)+1 " + (list.get(i) + 1));
            // System.out.println("list.get(i)-1 "+list.get(i)-1);
            // System.out.println("list.get(i+1) "+list.get(i+1));
        }
        // System.out.println(monoTonic(list));
        // int p=39921;
        // int q=13;
        // System.out.println(p%q);
    }
}
