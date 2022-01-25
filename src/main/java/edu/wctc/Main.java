package edu.wctc;

import edu.wctc.cointoss.Game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        game.play();

        List<String> names = new ArrayList<>();
        names.add("Mario");
        names.add("Luigi");
        names.add("Yoshi");

        for(String tmpName : names) {
            System.out.println(tmpName);
        }

        Random randNumGen = new Random();

        // generate a random int between 1 and 13
        // A - 1
        // J - 11
        // Q - 12
        // K - 13
        int card = (int)Math.floor(Math.random() * 13) + 1; // 0 -- not quite 1
        int points;

        // figure out how many points that card is worth
        switch(card) {
            case 1:
                points = 11;
                break;
            case 11:
            case 12:
            case 13:
                points = 10;
                break;
            default:
                points = card;
        }

        System.out.printf("Your card was %d. It is worth %d points.", card, points);
    }
}
