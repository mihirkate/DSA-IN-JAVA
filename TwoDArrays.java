
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

    public static void main(String[] args) {

        // repeatationOf2DArray(array);
        transpose(matrix);
    }
}
