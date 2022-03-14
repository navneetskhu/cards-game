package org.example.core;

public class Card {
    private final Suite suite;
    private final Rank rank;
    private boolean isFaceUp;

    public Card(Rank rank, Suite suite) {
        this.suite = suite;
        this.rank = rank;
        isFaceUp = false;
    }

    public String getSuit() {
        return suite.suitName();
    }

    public int getRank() {
        return rank.getRank();
    }

    public void flipCard() {
        isFaceUp = !isFaceUp;
    }

    @Override
    public String toString() {
        String st = " ";
        if (isFaceUp) {
            st += rank.getRankString() + " of " + getSuit() + " ";
        }
        return st;
    }
}
