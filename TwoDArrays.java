
import java.util.*;

public class TwoDArrays {

    public static void sumOfMatrix(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i <= matrix.length - 1; i++) {
            for (int j = 0; j <= matrix[0].length - 1; j++) {
                sum = sum + matrix[i][j];
            }
        }
        System.out.println("sim  is " + sum);
    }

    public static void printMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void transpose(int matrix[][]) {
        int row = 4;
        int col = 4;
        printMatrix(matrix);
        int transpose[][] = new int[row][col];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
            System.out.println();
        }
        System.out.println("the  Transposed matrix is  ");
        printMatrix(transpose);
    }

    public static void main(String[] args) {

        // repeatationOf2DArray(array);
        transpose(matrix);
    }
}
