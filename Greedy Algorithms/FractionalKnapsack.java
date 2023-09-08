import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static void fractionalKnapsack(int val[], int wt[], int capacity) {
        double ratio[][] = new double[val.length][2];
        /*
         * 0th col-index
         * 1st col-ratio
         */
        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = (double) val[i] / wt[i];
        }
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
        int finalProfit = 0;

        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            if (capacity >= wt[idx]) {
                // include Full item
                finalProfit = finalProfit + val[idx];
                capacity = capacity - wt[idx];
            } else {
                // include Fractional Item
                finalProfit += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }
        System.out.println("Final Profit is " + finalProfit);
    }

    public static void main(String[] args) {
        int val[] = { 60, 100, 120 };
        int wt[] = { 10, 20, 30 };
        int capacity = 50;
        fractionalKnapsack(val, wt, capacity);
    }
}
