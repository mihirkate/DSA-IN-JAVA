import java.util.HashSet;
import java.util.*;

public class HashSets {
    public static void main(String[] args) {
        /*
         * HashSet<Integer> hs = new HashSet<>();
         * hs.add(1);
         * hs.add(2);
         * hs.add(1);
         * hs.add(4);
         * 
         * System.out.println(hs);
         * if (hs.contains(7)) {
         * System.out.println("set contains");
         * } else {
         * System.out.println("set does not  contains");
         * 
         * }
         * hs.remove(2);
         * System.out.println("After Removing");
         * System.out.println(hs);
         */

        HashSet<String> set = new HashSet<>();
        set.add("Mumbai");
        set.add("Pune");
        set.add("Delhi");
        Iterator it = set.iterator();
        System.out.println(set);
        LinkedHashSet lhs = new LinkedHashSet<>();
        lhs.add("Mumbai");
        lhs.add("Pune");
        lhs.add("Delhi");
        System.out.println(lhs);

    }
}
