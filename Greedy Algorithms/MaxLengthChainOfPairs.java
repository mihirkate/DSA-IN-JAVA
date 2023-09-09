import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MaxLengthChainOfPairs {
    public static int maxlength(int pairs[][]) {
        int chainLength = 0;
        Arrays.sort(pairs, Comparator.comparingInt(o -> o[1]));

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(pairs[0][0]);
        chainLength = 1;
        int chainEnd = pairs[0][1];
        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] > chainEnd) {
                chainLength++;
                ans.add(pairs[i][0]);
                chainEnd = pairs[i][1];
            }
        }
        System.out.println("\nSelected  Chains  are  ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("Chain " + "{" + ans.get(i) + "}" + " ");
        }
        System.out.println();
        System.out.println();
        return chainLength;
    }

    public static void main(String[] args) {
        int pairs[][] = { { 1, 20 }, { 5, 19 }, { 39, 20 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };
        System.out.println("The max lenghth is " + maxlength(pairs));
    }
}
