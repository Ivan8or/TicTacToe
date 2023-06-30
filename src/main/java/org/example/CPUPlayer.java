package org.example;

public class CPUPlayer implements TicTacToePlayer {

    @Override
    public int makeMove(TicTacToeBoard board) {
        int[] possibleMoves = board.availableSlots();
        int moveIndex = (int) (Math.random() * possibleMoves.length);
        return possibleMoves[moveIndex];
    }
}
