import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ChocolaProblem {
    public static int chocola(Integer costVer[], Integer costHor[]) {
        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        // Horizontal cut-->h, Vertical Cut--->v
        int h = 0, v = 0;
        int hp = 1, vp = 1;
        int cost = 0;
        while (h < costHor.length && v < costVer.length) {
            // cut for hozrizontal
            if (costVer[v] <= costHor[h]) {
                // horixzontal cut;
                cost += (costHor[h] * vp);
                hp++;
                h++;
            } else {
                // vertical cut
                cost += costVer[v] * hp;
                vp++;
                v++;
            }
        }

        // Remaining Elements
        while (h < costHor.length) {
            cost += (costHor[h] * vp);
            hp++;
            h++;
        }
        while (v < costVer.length) {
            cost += costVer[v] * hp;
            vp++;
            v++;
        }
        return cost;
    }

    public static void main(String[] args) {
        Integer costVer[] = { 2, 1, 3, 1, 4 };
        Integer costHor[] = { 4, 1, 2 };
        int cost = chocola(costVer, costHor);
        System.out.println("\nThe total Minimum cost for cutting the choclate is  " + cost);
    }
}
