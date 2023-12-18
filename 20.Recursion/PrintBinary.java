public class PrintBinary {
    public static void printBinaryNo(int n, int lastplace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        printBinaryNo(n - 1, 0, str + "0");
        if (lastplace == 0) {
            printBinaryNo(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {
        printBinaryNo(3, 0, "");
    }
}
