public class Factorial {
    public static void printDecNo(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDecNo(n - 1);
    }

    public static void printIncNo(int n) {
        if (n == 1) {
            System.out.print(" " + n);
            return;
        }
        printIncNo(n - 1);
        System.out.print(" " + n);
    }

    public static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int fnm1 = factorial(n - 1);
        int fn = n * factorial(n - 1);

        return fn;
    }

    public static int sumNatural(int n) {
        if (n == 1) {
            return 1;
        }
        int f = n + factorial(n - 1);
        System.out.println(f);
        return f;
    }

    public static int fibo(int n) {

        if (n == 1 || n == 0) {
            return n;

        }
        int fib3 = fibo(n - 1) + fibo(n - 2);
        return fib3;
    }

    public static void main(String[] args) {
        printDecNo(11);
        printIncNo(5);
        /*
         * factorial(8);
         * int factorial = factorial(5);
         * System.out.println(factorial);
         */
        sumNatural(3);
        System.out.println(fibo(5));
    }
}
