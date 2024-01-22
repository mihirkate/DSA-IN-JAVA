import java.util.Scanner;

class Matrix {
    int a[][] = new int[3][3];
    int b[][] = new int[3][3];
    int c[][] = new int[3][3];

    public void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter matrix A:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter Element: ");
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter matrix B:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter Element: ");
                b[i][j] = sc.nextInt();
            }
        }
    }

    // Multiplying The Matrix
    public void multiply() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    c[i][j] = c[i][j] + a[i][k] * b[i][k];
                }
            }
            System.out.println("");
        }
    }

    // displaying the elementss
    public void display() {
        System.out.println("Elements are  in A:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + a[i][j]);
            }
            System.out.println("");
        }
        System.out.println("Elements are  in B:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + b[i][j]);
            }
            System.out.println("");
        }

        System.out.println("The Multiplication in A &  B:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + c[i][j]);
            }
            System.out.println("");
        }
    }
}

public class Multiplication {
    public static void main(String[] args) {
        Matrix m = new Matrix();
        m.getdata();
        m.multiply();
        m.display();
    }
}
