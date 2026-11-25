class Solution {

    public boolean checkRows(char[][] board) {
        for (int i = 0; i < 9; i++) {
            Set<Integer> s = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int x = board[i][j] - '0';
                    if (!s.add(x)) { // s.add() returns false if x is already present
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public boolean checkColumns(char[][] board) {
        for (int i = 0; i < 9; i++) {
            Set<Integer> s = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (board[j][i] != '.') { // Fixed: swapped i and j to traverse columns
                    int x = board[j][i] - '0';
                    if (!s.add(x)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public boolean checkQuad(char[][] board, int i, int j) {
        Set<Integer> s = new HashSet<>();
        for (int x = i; x < i + 3; x++) {
            for (int y = j; y < j + 3; y++) {
                if (board[x][y] != '.') { // Fixed: added '.' check and used [x][y]
                    int num = board[x][y] - '0';
                    if (!s.add(num)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public boolean checkGrids(char[][] board) {
        for (int i = 0; i < 9; i += 3) {
            if (!checkQuad(board, i, 0) || 
                !checkQuad(board, i, 3) || 
                !checkQuad(board, i, 6)) {
                return false;
            }
        }
        return true;
    }

    public boolean isValidSudoku(char[][] board) {
        return checkRows(board) && checkColumns(board) && checkGrids(board);
    }
}