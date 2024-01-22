import java.util.Arrays;

public class TribonacciSequence {
    public static int trib(int n, int dp[]) {

        if (n == 0 || n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }

        if (dp[n] != 0)

        {
            return dp[n];
        }

        dp[n] = trib(n - 1, dp) + trib(n - 2, dp) + trib(n - 3, dp);
        print(dp);
        return dp[n];
    }

    public static void print(int dp[]) {
        for (int i = 0; i < dp.length; i++) {
            System.out.print(dp[i] + " ");
        }
        System.out.println();
    }

    public static int triboTab(int n) {
        int dp[] = new int[n + 1];
        dp[0] = dp[1] = 0;
        dp[2] = 1;

        for (int i = 3; i < n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
            dp[n] = dp[i];
        }
        print(dp);
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 10;
        int dp[] = new int[n + 1];
        Arrays.fill(dp, 0);

        System.out.println(triboTab(n));

    }
}
