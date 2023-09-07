import java.util.*;

public class SearchingIn2DMatrix {
    public static boolean search(int matrix[][], int key) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Found at (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println(" not Found  " + key);
        return false;
    }

    public static void creation2DArrays() {
        System.out.println("Matrix follows Zero based Indexing ");
        System.out.println("Enter Elements in the Matrix ");
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        // display

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println();
        }
        int key = sc.nextInt();
        search(matrix, key);
    }

    public static void main(String[] args) {
        int matrix[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };
        creation2DArrays();
    }
}
