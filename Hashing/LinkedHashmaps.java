import java.util.LinkedHashMap;

public class LinkedHashmaps {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 100);
        lhm.put("china", 200);
        lhm.put("Japan", 400);
        System.out.println(lhm);
    }
}
