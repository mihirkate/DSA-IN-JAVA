
public class TransposeOfMatric {
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

    public static void printMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int matrix[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };

        transpose(matrix);
    }
}
