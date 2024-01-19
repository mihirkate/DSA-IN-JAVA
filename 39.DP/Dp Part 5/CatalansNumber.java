import java.util.*;

public class CatalansNumber {
    public static int catRec(int n) {
        int ans = 0;
        if (n == 0 || n == 1) {
            return 1;
        }
        for (int i = 0; i <= n - 1; i++) {
            ans += catRec(i) * catRec(n - i - 1);
        }
        return ans;
    }

    public static int catMemo(int n, int dp[]) {
        int ans = 0;

        if (n == 0 || n == 1) {
            return 1;
        }
        // memoization
        if (dp[n] != -1) {
            return dp[n];
        }
        for (int i = 0; i < n; i++) {
            ans += catMemo(i, dp) * catMemo(n - i - 1, dp);
            dp[n] = ans;
        }
        print(dp);
        return ans;
    }

    public static void print(int dp[]) {
        for (int i = 0; i < dp.length; i++) {
            System.out.print(dp[i] + " ");
        }
        System.out.println();
    }

    public static int catTabu(int n) {
        // O(n^2);
        int dp[] = new int[n + 1];
        dp[0] = dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] += dp[j] * dp[i - j - 1];
            }
        }
        print(dp);
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 4;

        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println("Catlan number for " + n + "is :" + catTabu(n));
        print(dp);
    }
}
