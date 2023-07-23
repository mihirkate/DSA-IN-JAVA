import java.util.*;

public class Suduko {
    public static boolean isSafe(int suduko[][], int row, int col, int digit) {
        // column
        // column is fixed
        for (int i = 0; i <= 8; i++) {
            if (suduko[i][col] == digit) {
                return false;
            }
        }
        // row
        // row is fixed
        for (int j = 0; j <= 8; j++) {
            if (suduko[row][j] == digit) {
                return false;
            }
        }

        // grid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (suduko[i][j] == digit) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean sudukoSolver(int suduko[][], int row, int col) {
        // base case
        if (row == 9) {
            return true;
        }
        // recursion
        int nextrow = row, nextcol = col + 1;
        if (col + 1 == 9) {
            nextrow = row + 1;
            nextcol = 0;
        }
        if (suduko[row][col] != 0) {
            return sudukoSolver(suduko, nextrow, nextcol);
        }
        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(suduko, row, col, digit)) {
                suduko[row][col] = digit;// place
                if (sudukoSolver(suduko, nextrow, nextcol)) {
                    // true return kiya tho solution exist
                    return true;
                }
                suduko[row][col] = 0;// backtracking
            }
        }

        return false;
    }

    public static void printSuduko(int suduko[][]) {
        System.out.println("------------Sudukoo---------");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(suduko[i][j] + " ");
            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         * int suduko[][] = { { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
         * { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
         * { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
         * { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
         * { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
         * { 9, 6, 0, 4, 0, 5, 3, 0, 0, },
         * { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
         * { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
         * { 8, 2, 7, 0, 0, 9, 0, 1, 3 } };
         */

        
         int suduko[][] = {
         { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
         { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
         { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
         { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
         { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
         { 0, 0, 0, 0, 0, 0, 0, 0, 0, },
         { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
         { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
         { 0, 0, 0, 0, 0, 0, 0, 0, 0 } };
         

            /*int suduko[][] = {
                { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, },
                { 0,0,0,0,0,0,0,0,0,0 },
                { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
                { 0, 0, 5, 2, 0, 6, 3, 0, 0 }
        };
        */

        printSuduko(suduko);
        if (sudukoSolver(suduko, 0, 0)) {
            // returns true then print
            System.out.println("Solution exist");
            printSuduko(suduko);
        } else {
            System.out.println("Solution does not  exist");
        }
    }
}
