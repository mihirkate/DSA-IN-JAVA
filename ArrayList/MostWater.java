import java.util.ArrayList;

public class MostWater {
    public static int saveWater(ArrayList<Integer> ht) {
        int maxWater = 0;
        for (int i = 0; i < ht.size(); i++) {
            for (int j = i + 1; j < ht.size(); j++) {
                int height = Math.min(ht.get(i), ht.get(j));
                int width = j - 1;
                int currentlevel = height * width;

                maxWater = Math.max(maxWater, currentlevel);
            }
        }
        return maxWater;
    }

    public static int twoPointer(ArrayList<Integer> ht) {
        int maxwater = 0;
        int lp = 0;
        int rp = ht.size() - 1;
        while (lp < rp) {
            int height = Math.min(ht.get(lp), ht.get(rp));
            int width = rp - lp;
            int currentlevel = width * height;
            maxwater = Math.max(currentlevel, maxwater);
            if (ht.get(lp) < ht.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxwater;

    }

    public static void main(String[] args) {
        ArrayList<Integer> ht = new ArrayList<>();
        ht.add(1);
        ht.add(8);
        ht.add(6);
        ht.add(2);
        ht.add(5);
        ht.add(4);
        ht.add(8);
        ht.add(3);
        ht.add(7);
        // System.out.println("Max water Stored is :"+saveWater(ht));
       System.out.println(" " +twoPointer(ht));
    } 
}
