package org.example.core;

public class Player {
    private final Hand hand;

    public Player() {
        hand = new Hand();
    }

    public String show() {
        return hand.showHand();
    }

    public Hand getHand() {
        return hand;
    }

    public void clearHand() {
        hand.clear();
    }
}
