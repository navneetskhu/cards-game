package test;

import org.example.core.Card;
import org.example.core.Hand;
import org.example.core.Rank;
import org.example.core.Suite;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HandTest {

    Hand hand = null;

    @BeforeEach
    public void init() {
        hand = new Hand();
    }

    @Test
    public void shouldCreateEmptyHand() {
        assertEquals(hand.hasNumberOfCards(), 0);
    }

    @Test
    public void shouldAddCardinHand() {
        hand.add(new Card(Rank.ACE, Suite.SPADES));
        assertEquals(hand.hasNumberOfCards(), 1);
    }

    @Test
    public void shouldClearHand(){
        hand.add(new Card(Rank.ACE, Suite.SPADES));
        hand.clear();
        assertEquals(hand.hasNumberOfCards(), 0);
    }
}
