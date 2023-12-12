import java.util.*;

public class Operations {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        // put - O(1)
        hm.put("India", 150);
        hm.put("china", 12);
        hm.put("butan", 67);
        System.out.println(hm);

        // get -O(1)
        int population = hm.get("India");
        System.out.println("The Popukation of India " + population);
        System.out.println(hm.get("Indonesia"));

        // contains key
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Indonesia"));

        // remove -O(1)

        System.out.println(hm.remove("china"));
        System.out.println(hm.remove("Indonesia"));
        // iterations
        Set<String> keys = hm.keySet();
        System.out.println("The keys are ");
        System.out.println(keys);
        // size
        System.out.println("The size of the Hashmap is :" + hm.size());

        // isEmpty -O(1)

        System.out.println("The map is empty:" + hm.isEmpty());
        // clear
        hm.clear();
        System.out.println("The map is empty:" + hm.isEmpty());

    }
}