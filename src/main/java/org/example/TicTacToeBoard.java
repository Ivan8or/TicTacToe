package org.example;

public class TicTacToeBoard {

    private Side[] board;

    public TicTacToeBoard() {
        board = new Side[9];
    }

    public boolean placePiece(Side piece, int spot) {
        if(board[spot] != null)
            return false;

        board[spot] = piece;
        return true;
    }

    public int[] availableSlots() {
        int amount = 0;
        for(int i = 0; i < board.length; i++) {
            if(board[i] == null)
                amount++;
        }

        int[] toReturn = new int[amount];
        int increment = 0;
        for(int i = 0; i < board.length; i++) {
            if(board[i] == null)
                toReturn[increment++] = i;
        }
        return toReturn;
    }

    private String sideString(Side piece) {
        if(piece == null)
            return " ";
        return piece.toString();
    }

    private boolean match(int a, int b, int c) {
        return board[a] == board[b] && board[b] == board[c];
    }

    public Side getWinner() {
        if(match(0,1,2) || match(0,3,6) || match(0,4,8))
            return board[0];
        if(match(1,4,7) || match(2,4,6) || match(3,4,5))
            return board[4];
        if(match(6,7,8) || match(2,5,8))
            return board[8];
        return null;
    }

    public boolean gameEnded() {
        return getWinner() != null || availableSlots().length == 0;
    }

    @Override
    public String toString() {
        return  "\n" +
                "     |     |     \n" +
                "  " + sideString(board[0]) + "  |  " + sideString(board[1]) + "  |  " + sideString(board[2]) + "  \n" +
                "_____|_____|_____\n" +
                "     |     |     \n" +
                "  " + sideString(board[3]) + "  |  " + sideString(board[4]) + "  |  " + sideString(board[5]) + "  \n" +
                "_____|_____|_____\n" +
                "     |     |     \n" +
                "  " + sideString(board[6]) + "  |  " + sideString(board[7]) + "  |  " + sideString(board[8]) + "  \n" +
                "     |     |     \n" +
                "\n";
    }
}
