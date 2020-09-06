/**
 * @description:
 * @author: Kevin Arthas
 * @date: 2020/9/5
 * @time: 18:59
 */
public class Solution36 {
    public boolean isValidSudoku(char[][] board) {
        int[][] line = new int[9][9];
        int[][] row = new int[9][9];
        int[][] box = new int[9][9];
        int num;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    num = board[i][j] - '1';
                    line[num][j]++;
                    row[i][num]++;
                    box[i / 3 * 3 + j / 3][num]++;
                    if (line[num][j] == 2 || row[i][num] == 2 || box[i / 3 * 3 + j / 3][num] == 2) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
