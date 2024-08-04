public class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> ans = new HashSet<>();
        for (int i = 0; i < 9; ++i) {
            for (int j = 0; j < 9; ++j) {
                char number = board[i][j];
                if (number != '.') {
                    if (!ans.add(number + " in row " + i) ||
                        !ans.add(number + " in column " + j) ||
                        !ans.add(number + " in block " + i/3 + "-" + j/3)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
