package org.example;

public class TicTacToeGame {

    private TicTacToePlayer playerX;
    private TicTacToePlayer playerO;
    private TicTacToeBoard board;

    public TicTacToeGame(TicTacToePlayer playerX, TicTacToePlayer playerO) {
        this.playerX = playerX;
        this.playerO = playerO;
        board = new TicTacToeBoard();
    }

    private int sideAsIndex(Side side) {
        return side == Side.X ? 0 : 1;
    }

    public void start() {
        TicTacToePlayer[] players = { playerX, playerO };
        Side turnSide = Side.X;

        do {
            System.out.println(board);
            int move = players[sideAsIndex(turnSide)].makeMove(board);
            board.placePiece(turnSide, move);
            turnSide = turnSide.flip();

        }while(!board.gameEnded());

        Side winner = board.getWinner();
        if(winner == null)
            System.out.println("It's a draw!");
        else
            System.out.println("Side "+winner+" won!");
    }

}
