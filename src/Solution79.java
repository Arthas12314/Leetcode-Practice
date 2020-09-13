/**
 * @description:
 * @author: Kevin Arthas
 * @date: 2020/9/13
 * @time: 14:37
 */
public class Solution79 {
    private String word;
    private boolean flag = false;

    public boolean exist(char[][] board, String word) {
        int line = board.length;
        int row = board[0].length;
        this.word = word;
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < row; j++) {
                if (dfs(board, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, int i, int j, int index) {
        if (word.length() == index) {
            flag = true;
            return true;
        }
        if (i < 0 || j < 0 || i > board.length - 1 || j > board[0].length - 1 || word.charAt(index) != board[i][j]) {
            return false;
        }

        if (!flag) {
            char temp = board[i][j];
            board[i][j] = '.';
            boolean markLeft = dfs(board, i - 1, j, index + 1);
            boolean markUp = dfs(board, i, j - 1, index + 1);
            boolean markRight = dfs(board, i + 1, j, index + 1);
            boolean markDown = dfs(board, i, j + 1, index + 1);
            board[i][j] = temp;
            return markLeft || markRight || markDown || markUp;
        }
        return false;
    }
}
