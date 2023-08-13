
public class TileProblem {
    public static int tileProblem(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } // choices
          // 1-> vertical hai aur 2->Horizontal hai
          // vertical->f(n-1)-->fnm1
        int fnm1 = tileProblem(n - 1);
        // horizontal-->f(n-2)-->fnm2
        int fnm2 = tileProblem(n - 2);
        int totWays = fnm1 + fnm2;
        return totWays;
    }

    public static void main(String[] args) {
        System.out.println(tileProblem(4));
    }
}
