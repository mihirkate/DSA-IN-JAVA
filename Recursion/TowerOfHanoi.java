
public class TowerOfHanoi {
    public static void towerOfHanoi(int n, String src, String help, String dest) {

        if (n == 1) {
            System.out.println("transfer disk " + n + "from " + src + " to " + help);
            return;
        }
        towerOfHanoi(n - 1, src, dest, help);
        System.out.println("transfer disk " + n + "from " + src + " to " + help);
        towerOfHanoi(n - 1, help, src, dest);

    }

    public static void main(String[] args) {
        towerOfHanoi(3, "s", "H", "D");
    }
}
