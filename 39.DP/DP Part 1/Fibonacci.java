public class Fibonacci {
    public static int fib(int n, int dp[]) {
        // Using Memoization
        if (n == 0 || n == 1) {
            return n;
        }
        if (dp[n] != 0) {
            return dp[n];

        }
        dp[n] = fib(n - 1, dp) + fib(n - 2, dp);
        return dp[n];

    }

    public static int fibTab(int n) {
        int f[] = new int[n + 1];
        f[0] = 0;
        f[1] = 1;

        for (int i = 2; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[n];
    }

    public static void main(String[] args) {
        int n = 6;
        int dp[] = new int[n + 1];
        System.out.println("Fibonacci of " + n + " is  :" + fibTab(n));
    }
}