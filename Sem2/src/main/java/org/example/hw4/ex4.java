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
        System.out.println(Integer.parseInt(String.valueOf(board[0][1])) + Integer.parseInt(String.valueOf(board[0][2])));
    }
}
//            System.out.println("Validete:" + isValidSudoku(board));  }

//    private static boolean isValidSudoku(char[][] board) {
//            boolean flag = true;
//        for (int i = 0; i < board.length; i++) {
//            for (int j = 0; j < board.length; j++) {
//                for (int k = 1; k < board.length; k++) {
//                    if (Integer.parseInt(String.valueOf(board[i][j])) == Integer.parseInt(String.valueOf(board[i][k]))){
//                        flag = false;
//                    }
//                    if (board[j][i] == board[k][i]){
//                        flag = false;
//                    }
//                }
//            }
//        }
//        return flag;
//    }
//}
