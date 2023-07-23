public class RatInMaze {
    public static void printRats(int sol[][]) {
        for (int i = 0; i < sol.length; i++) {
            for (int j = 0; j < sol.length; j++) {
                System.out.print(" " + sol[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isSafeRat(int rat[][], int rows, int col) {
        return (rows >= 0 && rows < rat.length && col >= 0 && col < rat.length && rat[rows][col] == 1);

    }

    public static boolean solveMaxe2(int rat[][]) {
        int n = rat.length;
        int sol[][] = new int[n][n];
        if (solveMaze(rat, 0, 0, sol) == false) {
            System.out.println("Solution dosent exist");
        }
        printRats(sol);
        return true;
    }

    public static boolean solveMaze(int rat[][], int rows, int col, int sol[][]) {
        // base case
        if (rows == rat.length - 1 && col == rat.length - 1 && rat[rows][col] == 1) {
            // reached the destination
            sol[rows][col] = 1;
            return true;
        }
        if (isSafeRat(rat, rows, col) == true) {
            if (sol[rows][col] == 1) {
                return false;
            }
            sol[rows][col] = 1;
            // down
            if (solveMaze(rat, rows + 1, col, sol)) {
                return true;
            }

            // right
            if (solveMaze(rat, rows, col + 1, sol)) {
                return true;
            }
            sol[rows][col] = 0;// backtracking
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        int rat[][] = { { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 0, 1, 0, 0 },
                { 1, 1, 1, 1 }, };

        System.out.println("Brfore ");
        printRats(rat);
        System.out.println("after");
        solveMaxe2(rat);

    }

}
