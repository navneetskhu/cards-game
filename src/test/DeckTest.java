package test;


import org.example.core.Deck;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DeckTest {

    Deck deck = null;

    @BeforeEach
    void init() {
        deck = new Deck();
    }

    @Test
    public void shouldContainFiftyTwoCards() {
        assertEquals(deck.cards().size(), 52);
    }

    @Test
    public void shouldRemoveOneCardFromDeckWhenDealt() {
        deck.dealCard();
        assertEquals(deck.cards().size(), 51);

    }
}
