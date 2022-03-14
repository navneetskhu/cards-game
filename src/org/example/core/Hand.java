package org.example.core;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private final List<Card> cards;

    public Hand() {
        cards = new ArrayList<>();
    }

    public void clear() {
        cards.clear();
    }

    public void add(Card card) {
        cards.add(card);
    }

    public String showHand() {
        StringBuilder st = new StringBuilder("");

        for (Card card : cards) {
            card.flipCard();
            st.append(card);
        }
        return st.toString();
    }

    public List<Card> cards() {
        return cards;
    }

    public int hasNumberOfCards(){
        return cards.size();
    }

    public int totalPoints() {
        int totalPoints = 0;
        for (Card card : this.cards()) {
            totalPoints += card.getRank();
        }
        return totalPoints;
    }

}
