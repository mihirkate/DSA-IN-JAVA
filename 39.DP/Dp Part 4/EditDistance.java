public class EditDistance {
    public static int editDistance(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n + 1][m + 1];
        // initialization of DP array
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {

                if (i == 0) {
                    dp[i][j] = j;
                }
                if (j == 0) {
                    dp[i][j] = i;
                }
            }
        }
        // main task
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {// same
                    dp[i][j] = dp[i - 1][j - 1];
                } else {// different
                        // case 1- add
                    int case1 = dp[i][j - 1] + 1;
                    // case 2- delete
                    int case2 = dp[i - 1][j] + 1;
                    // case 3 replace
                    int case3 = dp[i - 1][j - 1] + 1;
                    dp[i][j] = Math.min(Math.min(case1, case2), case3);

                }
            }
        }
        print(dp);
        return dp[n][m];
    }

    public static void print(int dp[][]) {
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        String str1 = "intention";
        String str2 = "execution";
        System.out.println(
                "Operations required to change " + " '" + str1 + "' " + " to " + " '" + str2 + "' " + "is :"
                        + editDistance(str1, str2));
    }
}
