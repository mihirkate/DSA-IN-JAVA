
public class CoinsChange {
    public static void print(int dp[][]) {
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int coinChange(int coins[], int sum) {
        int n = coins.length;
        int dp[][] = new int[n + 1][sum + 1];
        // initializations
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 1;
        }
        for (int j = 1; j < dp.length; j++) {
            dp[0][j] = 0;
        }
        // main task
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                // valid
                if (coins[i - 1] <= j) {
                    dp[i][j] = dp[i][j - coins[i - 1]] + dp[i - 1][j];
                    // include + exclude
                } else {
                    // if invalid then
                    // exclude
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        print(dp);
        return dp[n][sum];
    }

    public static void main(String[] args) {
        int coins[] = { 2, 5, 3, 6 };
        int sum = 10;
        System.out.println(coinChange(coins, sum));
    }
}
