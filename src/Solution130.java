
/**
 * @author Arthas
 */
public class Solution130 {
    public void solve(char[][] board) {
        int row = board.length;
        if (row < 1) {
            return;
        }
        int line = board[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < line; j++) {
                dfs(board, i, j);
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < line; j++) {
                switch (board[i][j]) {
                    case 'O':
                        board[i][j] = 'X';
                        break;
                    case '#':
                        board[i][j] = 'O';
                        break;
                    default:
                        break;
                }
            }
        }
    }

    private void dfs(char[][] board, int i, int j) {
        int row = board.length;
        int line = board[0].length;
        if (board[i][j] == 'O') {
            board[i][j] = '#';
            if (i != 0) {
                dfs(board, i - 1, j);
            }
            if (j != 0) {
                dfs(board, i, j - 1);
            }
            if (i != row - 1) {
                dfs(board, i + 1, j);
            }
            if (j != line - 1) {
                dfs(board, i, j + 1);
            }
        }
    }
}
