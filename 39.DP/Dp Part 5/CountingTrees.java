public class CountingTrees {
    public static int countBST(int n) {// O(n*n)
        int dp[] = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        int ans = 0;
        for (int i = 2; i < n + 1; i++) {
            for (int j = 0; j < i; j++) {
                int left = dp[j];
                int right = dp[i - j - 1];
                dp[i] += left * right;

            }
        }
        print(dp);
        return dp[n];
    }

    public static void print(int dp[]) {
        for (int i = 0; i < dp.length; i++) {
            System.out.print(dp[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 5;

        System.out.println(countBST(n));
    }
}
