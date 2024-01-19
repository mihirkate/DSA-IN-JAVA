
public class WildcardMatching {
    public static boolean wildcardMatching(String s, String p) {
        int n = s.length();
        int m = p.length();
        boolean dp[][] = new boolean[n + 1][m + 1];
        dp[0][0] = true;
        // pattern =" "
        for (int i = 1; i < n + 1; i++) {
            dp[i][0] = false;
        }
        for (int j = 1; j < m + 1; j++) {
            if (p.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 1];

            }
        }
        // bottom up
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                // case ith-> char== jth char ||jth char==?
                if (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '?') {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (p.charAt(j - 1) == '*') {
                    dp[i][j] = dp[i - 1][j - 1] || dp[i][j - 1];
                } else {
                    dp[i][j] = false;
                }
            }
        }
        // print(dp);
        return dp[n][m];
    }

    public static void print(boolean dp[][]) {
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        String patt = "**b";
        System.out.println(" wildcard can be possible :" + wildcardMatching(str, patt));
    }
}
