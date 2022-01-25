package edu.wctc.cointoss;

public class Coin {

    private String face; // "heads" or "tails"

    public void flip() {
        double randomNumber = Math.random();
        if (randomNumber < 0.5)
            face = "heads";
        else
            face = "tails";

//        face = (Math.random() < 0.5) ? "heads" : "tails";
    }

    public String getFace() {
        return face;
    }
}
