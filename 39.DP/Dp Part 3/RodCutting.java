public class RodCutting {
    public static void print(int dp[][]) {
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int rodCutting(int rodLength[], int price[], int totRod) {
        int n = rodLength.length;
        int dp[][] = new int[n + 1][totRod + 1];
        // initialization
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 0;
        }
        for (int i = 0; i < dp.length; i++) {
            dp[0][i] = 0;
        }
        // main task
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < totRod + 1; j++) {
                // valid
                if (rodLength[i - 1] <= j) {
                    dp[i][j] = Math.max(price[i - 1] + dp[i][j - rodLength[i - 1]], dp[i - 1][j]);
                }
                // invalid
                else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        print(dp);

        return dp[n][totRod];

    }

    public static void main(String[] args) {
        int rodLength[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int price[] = { 1, 5, 8, 9, 10, 17, 17, 20 };
        int totRod = 8;
        System.out.println("Answer for rodcutting " + rodCutting(rodLength, price, totRod));
    }
}
