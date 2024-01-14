import java.util.Arrays;

public class ClimbingStairs {

    public static int countWays(int n, int ways[]) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        if (ways[n] != 0) {
            return ways[n];
        }
        ways[n] = countWays(n - 1, ways) + countWays(n - 2, ways);
        return ways[n];
    }

    public static int climbingStairsTabu(int n) {
        int ways[] = new int[n + 1];
        ways[0] = 1;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                ways[i] = ways[i - 1];
            } else {

                ways[i] = ways[i - 1] + ways[i - 2];
            }
        }
        for (int i = 0; i < ways.length; i++) {
            System.out.print(ways[i] + " ");
        }
        return ways[n];
    }

    public static void main(String[] args) {
        int n = 4;
        int ways[] = new int[n + 1];

        System.out.println("Ways to climb Stairs are " +
                climbingStairsTabu(n));
    }
}
