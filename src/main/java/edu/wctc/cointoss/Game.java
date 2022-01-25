package edu.wctc.cointoss;

import java.util.Scanner;

public class Game {
    private Scanner keyboard;
    private int round;
    private Player player1, player2;
    private Coin coin;

    public Game() {
        keyboard = new Scanner(System.in);
        coin = new Coin();
    }

    public void play() {
        // prompt players for names
        System.out.print("Player 1, enter name: ");
        String name = keyboard.nextLine();
        player1 = new Player(name);

        System.out.print("Player 2, enter name: ");
        name = keyboard.nextLine();
        player2 = new Player(name);

        Player lastRoundWinner, lastRoundLoser;
        lastRoundLoser = player1;
        lastRoundWinner = player2;

        // while neither plays has 3 wins
        while (player1.getWins() < 3 && player2.getWins() < 3) {
            // ask loser for call
            System.out.printf("%s, calls (heads) or (tails): ",
                    lastRoundLoser.getName());
            String call = keyboard.nextLine();
            lastRoundLoser.setCall(call);

            // flip coin
            coin.flip();

            // if loser's call matches coin, loser wins
            if (lastRoundLoser.getCall().equalsIgnoreCase(coin.getFace())) {
                lastRoundLoser.win();

                // loser becomes new winner and vice versa
                // swap
                Player temp = lastRoundWinner;
                lastRoundWinner = lastRoundLoser;
                lastRoundLoser = temp;
            } else {
                // otherwise, other player wins
                lastRoundWinner.win();
            }
        }

        if (player1.getWins() == 3)
            System.out.printf("%s wins!", player1.getName());

        if (player2.getWins() == 3)
            System.out.printf("%s wins!", player2.getName());

        // game over
    }


}
