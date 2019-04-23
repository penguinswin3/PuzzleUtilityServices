package Sudoku.Client;

import Sudoku.Server.RevisedSudokuServer;
import Sudoku.Server.AnnotatedSudokuServer;

class SudokuClient {
    public static void main(String[ ] args) {
        RevisedSudokuServer server = new RevisedSudokuServer();
        AnnotatedSudokuServer sudokuService = server.getAnnotatedSudokuServerPort();

        System.out.println(sudokuService.solveBoard());

    }
}    
