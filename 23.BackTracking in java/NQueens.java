public class NQueens {
    public static void nqueens(char board[][], int row) {
        if (row == board.length) {
            printqueen(board);
            return;
        }
        for (int j = 0; j < board.length; j++) {
            if (issafe(board, row, j)) {

                board[row][j] = 'Q';
                nqueens(board, row + 1);// function call
                board[row][j] = 'X';// backtracking step
            }
        }
    }

    public static boolean issafe(char board[][], int row, int col) {
        // vertially up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // left diagnoal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // diagnal right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void printqueen(char board[][]) {
        System.out.println("-------CHESS BOARD -------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }
        nqueens(board, 0);
    }
}
