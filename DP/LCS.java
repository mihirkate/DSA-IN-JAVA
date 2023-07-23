public class LCS {
    public static int lcs(String a, String b, int i, int j) {

        if (i == a.length() || j == b.length()) {
            return 0;
        }

        int ans = 0;
        if (a.charAt(i) == b.charAt(j)) {
            // mathch found)
            ans = 1 + lcs(a, b, i + 1, j + 1);

        } else {
            ans = Math.max(lcs(a, b, i + 1, j), lcs(a, b, i, j + 1));
        }
        return ans;
    }

    public static void main(String[] args) {

        String a = "abaabacccab";
        String b = "babbabca";
        System.out.println(lcs(a, b, 0, 0));
    }
}