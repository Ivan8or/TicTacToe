package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class HumanPlayer implements TicTacToePlayer {

    static private Scanner sc = new Scanner(System.in);

    @Override
    public int makeMove(TicTacToeBoard board) {
        int[] possibleMoves = board.availableSlots();
        for(int i = 0; i < possibleMoves.length; i++)
            possibleMoves[i]++;

        int input;
        do {
            System.out.println("enter your next move ("+ Arrays.toString(possibleMoves)+"): ");
            input = sc.nextInt();
            System.out.println(Arrays.binarySearch(possibleMoves, input));
        }while(-1 == Arrays.binarySearch(possibleMoves, input));

        return input-1;
    }
}
