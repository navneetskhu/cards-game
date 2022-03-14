package org.example.core;

import java.util.*;

public class Deck extends Hand {
    private final ArrayList<Card> dealt = new ArrayList<Card>();
    Random rand = new Random();

    public Deck() {
        populate();
        shuffle();
    }

    public void populate() {
        for (Suite suite : Suite.values()) {
            for (Rank rank : Rank.values()) {
                Card card = new Card(rank, suite);
                this.add(card);
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(this.cards());
    }

    public Card dealCard() {
        List<Card> cards = this.cards();
        int rand = this.rand.nextInt(cards.size());
        Card card = cards.get(rand);
        cards.remove(card);
        dealt.add(card);
        return card;
    }
}
