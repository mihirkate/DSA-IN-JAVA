public class Grid {
    public static int gridWays(int i, int j, int n, int m) {
        // base case
        if (i == n - 1 && j == m - 1) {
            // condition for i ,j on last cell
            return 1;
        } else if (i == n || j == m) {
            // boundary cross cndtion

            return 0;
        }

        // right
        int w1 = gridWays(i, j + 1, n, m);
        // down
        int w2 = gridWays(i + 1, j, n, m);
        int totWays = w1 + w2;
        return totWays;
    }

    // public static int factn(int n) {
    //     // base case
    //     if (n == 1 || n == 0) {
    //         return n;
    //     }
    //     int w1 = factn(n - 1);
    //     return w1;
    // }

    // public static int factm(int m) {
    //     // base case
    //     if (m == 1 || m == 0) {
    //         return m;
    //     }
    //     int w1 = factn(m - 1);
    //     return w1;
    // }

    // public static int factmn(int n, int m) {
    //     // base case
    //     if (m == 1 || m == 0) {
    //         return m;
    //     }
    //     // base case
    //     if (n == 1 || n == 0) {
    //         return n;
    //     }
    //     int w3 = factmn(n - 1, m - 1);

    //     return w3;
    // }

    public static void main(String[] args) {
        int n = 3, m =3;
        System.out.println("The total ways are for " + n + " X " + m + " are:" + gridWays(0, 0, n, m));

        // int f1=((n-1)+(m-1))!/(n-1)!(m-1)!
        // int f2 = (factm(n) + factm(m));
        // int f3 = factmn(n, m);
        // int f4 = f2 / f3;
        // System.out.println(f4);
    }
}
