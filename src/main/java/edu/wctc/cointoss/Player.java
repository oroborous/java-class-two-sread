package edu.wctc.cointoss;

public class Player {
    private String name;
    private String call;
    private int wins;

    public Player(String theName) {
        this.name = theName;
    }

    public void win() {
        wins++;
    }

    public void setCall(String call) {
        this.call = call;
    }

    public String getName() {
        return name;
    }

    public String getCall() {
        return call;
    }

    public int getWins() {
        return wins;
    }
}
