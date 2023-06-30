package org.example;

public class Main {
    public static void main(String[] args) {

        TicTacToePlayer p1 = new CPUPlayer();
        TicTacToePlayer p2 = new CPUPlayer();

        TicTacToeGame game = new TicTacToeGame(p1, p2);
        game.start();
    }
}