package org.example.hw4;

/*
Требования
Объявлена доска 9 x 9 необходимо отвалидировать в соответствии с правилами
1. Каждая строка должна содержать цифру 1-9 без повторения
2. Каждая колонка должна содержать цифру 1-9 без повторения
3. Каждый под блок из 9 элементов 3 x 3 должна содержать цифру 1-9 без повторения
Ограничения
• board.length == 9
• board[i].length == 9
• board[i][j] значение число или '.'
*/
public class ex4 {
    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        System.out.println("Validate:" + isValidSudoku(board));
    }

    private static boolean isValidSudoku(char[][] board) {
        boolean flag = true;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                for (int k = j + 1; k < board.length; k++) {
                    if (board[i][j] == board[i][k] && board[i][j] != '.') {
                        flag = false;
                    }
                    if (board[j][i] == board[k][i] && board[j][i] != '.') {
                        flag = false;
                    }
                }
            }
        }
        for (int m = 0; m < 9; m += 3) {
            for (int n = 0; n < 9; n += 3) {
                for (int i = m; i < m + 3; i++) {
                    for (int j = n; j < n + 3; j++) {
                        for (int k = m; k < m + 3; k++) {
                            for (int l = n; l < n + 3; l++) {
                                String i2 = String.valueOf(i);
                                String j2 = String.valueOf(j);
                                String k2 = String.valueOf(k);
                                String l2 = String.valueOf(l);
                                if (!(i2 + j2).equals(k2 + l2)){
                                    if (board[i][j] == board[k][l] && board[i][j] != '.'){
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        return flag;
    }
}