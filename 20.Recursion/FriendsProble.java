public class FriendsProble {
    public static int friendsProblem(int n) {
        // pairing of friends Problem Asked in GolmanSachs
        // base case
        if (n == 1 || n == 2) {
            return n;
        }
        // choice ->Single|| paired
        // single
        int fnm1 = friendsProblem(n - 1);
        // paired
        int fnm2 = friendsProblem(n - 2);
        // total ways
        int totWays = fnm1 + (n - 1) * fnm2;
        return totWays;
    }

    public static void main(String[] args) {
        System.out.println(friendsProblem(4));
    }
}
