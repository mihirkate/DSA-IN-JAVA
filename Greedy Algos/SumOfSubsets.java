public class SumOfSubsets {

    public static boolean targetSumSubset(int arr[], int sum) {
        int n = arr.length;
        boolean dp[][] = new boolean[n + 1][sum + 1];
        for (int i = 0; i < n + 1; i++) {
            // i=items & j=targetsum
            dp[i][0] = true;
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                int v = arr[i - 1];
                // include
                if (v <= j && dp[i - 1][j - v] == true) {
                    dp[i][j] = true;
                }
                // exclude
                else if (dp[i - 1][j] == true) {
                    dp[i][j] = true;

                }
            }
        }
        return dp[n][sum];
    }

    public static void main(String[] args) {
        int number[] = { 4, 2, 7, 1, 3 };
        int sum = 10;
        System.out.println(targetSumSubset(number, sum));

    }
}
