package org.example.core;

public enum Suite {
    HEARTS("Hearts"),
    SPADES("Spades"),
    CLUBS("Clubs"),
    DIAMONDS("Diamonds");

    private final String suitName;

    Suite(String suitName) {
        this.suitName = suitName;
    }

    public String suitName() {
        return suitName;
    }
}