import java.util.Scanner;

public class Avg {
    public static void average() {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        float avg = (a + b + c) / 3;
        System.out.println("the avg is : " + avg);
    }

    public static void square() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of Square :");
        float a = sc.nextFloat();
        float area = a * a;
        System.out.println(" The area is :" + area);
    }

    public static void item() {
        int pencil = 10, pen = 20, eraser = 5;
        int total = pencil + pen + eraser;
        System.out.println("the total is : " + total);
    }

    public static void test() {
        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.99954;
        double result = (f * b) + (i % c) - (d * c);
        System.out.println("result:" + result);
    }

    public static void income() {
        Scanner sc = new Scanner(System.in);
        int sal, tax;
        System.out.println("enter Income : ");
        sal = sc.nextInt();
        if (sal < 500000) {
            tax = 0;

        } else if (sal >= 500000 && sal < 100000) {
            tax = (int) (sal * 0.2);
        } else {
            tax = (int) (sal * (0.3));
        }
        System.out.println("yoour tax is: " + tax);
        // System.out.println("your total salary after tax is :" + (sal - tax));
    }

    public static void loop() {
        int n = 10;
        for (int i = 0; i < n; i++) {
            System.out.println("hello ");
        }
    }

    public static void whileloop() {
        int n = 0;
        while (n != 10) {
            System.out.println("hello loop");
            n++;
        }
    }

    public static void star() {
        System.out.println();
        for (int i = 0; i <= 4; i++) {
            System.out.println("****");
        }
    }

    public static void reverse() {
        for (int i = 100; i >= 0; i--) {
            System.out.println(" " + i);
        }
    }

    public static void flip() {
        Scanner sc = new Scanner(System.in);
        int lastDigit;
        System.out.println("enter No : ");
        int n = sc.nextInt();
        while (n > 0) {
            lastDigit = n % 10;
            System.out.print(lastDigit + "");
            n = n / 10;
        }

    }

    public static void flipTheNo(int n) {
        /* int n = 10899; */
        int rev = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            rev = (rev * 10) + lastDigit;
            n = n / 10;

        }
        System.out.println(rev);
    }

    public static void star1() {
        for (int line = 1; line <= 4; line++) {
            for (int star = 1; star <= line; star++) {
                System.out.print("*");
            }
            System.out.println("");

        }
    }

    public static void main(String[] args) {
        // square();
        // average();
        // item();
        test();
        // int $ = 34;
        // System.out.println($);
        // income();
        // loop();
        // whileloop();
        // star();
        // reverse();
        // flip();
        /*
         * * System.out.println();
         * flipTheNo(5001);
         */
        // star1();
        /*
         * int n = 12;
         * int lastDigit = n / 10;
         * System.out.println(lastDigit);
         */
    }
}
